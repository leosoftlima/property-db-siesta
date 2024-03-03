package mop;

import java.util.TreeSet;
import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a non-comparable element is about to be inserted into TreeSet.
 *
 * When a TreeSet object is created without a specific comparator, all
 * elements inserted into the map must implement the Comparable interface.
 * http://docs.oracle.com/javase/6/docs/api/java/util/TreeSet.html#TreeSet%28%29
 *
 * This property verifies that each element implements the Comparable
 * interface, but does not verify if all elements are mutually comparable
 * because of performance degradation.
 *
 * @severity error
 */

public class TreeSet_ComparableHandler {

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public static void vioTreeSet_ComparableAddAll(TreeSet collection) {
    	UtilSpecificationHandler.eventTreeSet_ComparableAddAll(collection);

    }


    @Before("* java.util.Collection+.add(java.lang.Object)")
    public static void vioTreeSet_ComparableAdd(TreeSet treeSet) {
    	UtilSpecificationHandler.eventTreeSet_ComparableAdd(treeSet);
    }

}
