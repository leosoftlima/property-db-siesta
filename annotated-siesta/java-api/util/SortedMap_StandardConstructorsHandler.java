package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of SortedMap does not define the four "standard" constructors.
 *
 * All general-purpose sorted map implementation classes should provide four
 * "standard" constructors: 1) A void (no arguments) constructor, which
 * creates an empty sorted map sorted according to the natural ordering of its
 * keys. 2) A constructor with a single argument of type Comparator, which
 * creates an empty sorted map sorted according to the specified comparator.
 * 3) A constructor with a single argument of type Map, which creates a new
 * map with the same key-value mappings as its argument, sorted according to
 * the keys' natural ordering. 4) A constructor with a single argument of type
 * SortedMap, which creates a new sorted map with the same key-value mappings
 * and the same ordering as the input sorted map.
 * http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html
 *
 * Having four constructors cannot be enforced by the language, as interfaces
 * cannot contain constructors. This specification dynamically checks the
 * recommendation and warns if a sorted map does not have the four
 * constructors. Since there is no way to detect if the class is
 * "general-purpose", a violation of this property may be false positive.
 *
 * @severity warning
 */

public class SortedMap_StandardConstructorsHandler {

    @After("staticinitialization(java.util.SortedMap+)")
    public static void vioSortedMap_StandardConstructors(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
        UtilSpecificationHandler.eventSortedMap_StandardConstructors(objClasse);
    }
}
