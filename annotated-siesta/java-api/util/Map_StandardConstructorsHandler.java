package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of Map does not define the two "standard" constructors.
 *
 * All general-purpose Map implementation classes should provide two
 * "standard" constructors: a void (no arguments) constructor and a copy
 * constructor.
 * http://download.oracle.com/javase/6/docs/api/java/util/Map.html
 *
 * Having two constructors cannot be enforced by the language, as interfaces
 * cannot contain constructors. This specification dynamically checks the
 * recommendation and warns if a map does not have the two constructors. Since
 * there is no way to detect if the class is "general-purpose", a violation of
 * this property may be false positive.
 *
 * @severity warning
 */

public class Map_StandardConstructorsHandler {

    @After("staticinitialization(java.util.Map+)")
    public static void vioMap_StandardConstructors(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
        UtilSpecificationHandler.eventMap_StandardConstructors(objClasse);
    }
}
