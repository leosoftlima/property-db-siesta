package mop;

import java.io.*;
import java.util.*;

public class InvalidPropertiesFormatException_NonSerializable_1 {

    /**
     * Warns if an InvalidPropertiesFormatException object is being serialized or
     * deserialized.
     *
     * Although InvalidPropertiesFormatException inherits Serializable the
     * interface from Exception, it is not intended to be Serializable and
     * serialization methods are implemented to throw NotSerializableException.
     * http://docs.oracle.com/javase/6/docs/api/java/util/InvalidPropertiesFormatException.html
     *
     * This property warns if an InvalidPropertiesFormatException object is passed
     * to ObjectOutputStream.writeObject() as an argument. This property misses
     * errors because writeObject() can be indirectly called inside of JDK. Also,
     * it cannot detect whether or not ObjectInputStream.readObject() attempted to
     * deserialize an InvalidPropertiesFormatException object because a correct
     * implementation of InvalidPropertiesFormatException.readObject() always
     * throws an exception and there is no way to detect the type that was
     * attempted.
     *
     * @severity error
     */
    public static void main(String[] args) {
        try {
            InvalidPropertiesFormatException exception = new InvalidPropertiesFormatException("Invalid format");

            // Attempting to serialize the object
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("exception.ser"));
            oos.writeObject(exception);
            oos.close();

            // Attempting to deserialize the object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exception.ser"));
            InvalidPropertiesFormatException deserializedException = (InvalidPropertiesFormatException) ois.readObject();
            ois.close();
        } catch (NotSerializableException e) {
//            System.out.println("Error: InvalidPropertiesFormatException object cannot be serialized.");
        } catch (Exception e) {
//            System.out.println("Error: An unexpected exception occurred.");
//            e.printStackTrace();
        }
    }
}



