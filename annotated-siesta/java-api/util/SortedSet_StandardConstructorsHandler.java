package mop;

import org.aspectj.lang.JoinPoint;
import org.aspectjml.lang.annotation.After;

/**
 * Warns if a subclass of SortedSet does not define the four "standard" constructors.
 *
 * All general-purpose sorted set implementation classes should provide four
 * "standard" constructors: 1) A void (no arguments) constructor, which
 * creates an empty sorted set sorted according to the natural ordering of its
 * elements. 2) A constructor with a single argument of type Comparator, which
 * creates an empty sorted set sorted according to the specified comparator.
 * 3) A constructor with a single argument of type Collection, which creates a
 * new sorted set with the same elements as its argument, sorted according to
 * the natural ordering of the elements. 4) A constructor with a single
 * argument of type SortedSet, which creates a new sorted set with the same
 * elements and the same ordering as the input sorted set.
 * http://docs.oracle.com/javase/6/docs/api/java/util/SortedSet.html
 *
 * Having four constructors cannot be enforced by the language, as interfaces
 * cannot contain constructors. This specification dynamically checks the
 * recommendation and warns if a sorted set does not have the four
 * constructors. Since there is no way to detect if the class is
 * "general-purpose", a violation of this property may be false positive.
 *
 * @severity warning
 */

public class SortedSet_StandardConstructorsHandler {

    @After("staticinitialization(java.util.SortedSet+)")
    public static void vioSortedSet_StandardConstructors(JoinPoint joinPoint) {

    	Class objClasse = joinPoint.getStaticPart().getSignature().getDeclaringType();
        UtilSpecificationHandler.eventSortedSet_StandardConstructors(objClasse);
    }
}
