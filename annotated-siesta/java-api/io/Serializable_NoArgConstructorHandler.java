package mop;


import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a class is serializable, its superclass is not serializable, and
 * the class cannot access the superclass' no-arg constructor.
 *
 * To allow subtypes of non-serializable classes to be serialized, the subtype
 * may assume responsibility for saving and restoring the state of the
 * supertype's public, protected, and (if accessible) package fields. The
 * subtype may assume this responsibility only if the class it extends has an
 * accessible no-arg constructor to initialize the class's state. It is an
 * error to declare a class Serializable if this is not the case.
 * http://download.oracle.com/javase/6/docs/api/java/io/Serializable.html
 *
 * This property detects such error.
 *
 * @severity error
 */
public class Serializable_NoArgConstructorHandler {

    @After("staticinitialization(java.io.Serializable+)")
    public static void vioSerializable_NoArgConstructor(JoinPoint thisJoinPoint){
       Class objClasse = thisJoinPoint.getStaticPart().getSignature().getDeclaringType();
       IOSpecificationHandler.EventSerializable_NoArgConstructor(objClasse);
    }
}
