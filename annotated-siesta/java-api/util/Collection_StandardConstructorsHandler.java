package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of Collection does not define the two "standard"
 * constructors.
 *
 * All general-purpose Collection implementation classes should provide two
 * "standard" constructors: a no-arg constructor and a copy constructor.
 * http://download.oracle.com/javase/6/docs/api/java/util/Collection.html
 *
 * Having two constructors cannot be enforced by the language, as interfaces
 * cannot contain constructors. This specification dynamically checks the
 * recommendation and warns if a collection does not have the two
 * constructors. Since there is no way to detect if the class is
 * "general-purpose", a violation of this property may be false positive.
 *
 * @severity warning
 */

public class Collection_StandardConstructorsHandler {

    @After("staticinitialization(java.util.Collection+)")
    public static void vioCollection_StandardConstructors(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
    	UtilSpecificationHandler.eventCollection_StandardConstructors(objClasse);

    }
}
