package mop;

import org.aspectjml.lang.annotation.siesta.Before;

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

public class InvalidPropertiesFormatException_NonSerializableHandler {

    @Before("* java.io.ObjectOutputStream+.writeObject(..)")
    public static void vioInvalidPropertiesFormatException_NonSerializableWriteObject(String name, boolean isStatic, Object[] args){
       UtilSpecificationHandler.EventInvalidPropertiesFormatException_NonSerializableWriteObject(args);
    }

    @Before("* java.io.ObjectInputStream+.readObject(..)")
    public static void vioInvalidPropertiesFormatException_NonSerializableReadObject(String name, boolean isStatic, Object[] args){
    	UtilSpecificationHandler.EventInvalidPropertiesFormatException_NonSerializableReadObject(args);
    }

}
