package mop;

import java.util.SortedSet;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if a non-comparable element is about to be inserted into SortedSet.
 *
 * All elements inserted into a sorted set must implement the Comparable
 * interface (or be accepted by the specified comparator). Furthermore, all
 * such elements must be mutually comparable: e1.compareTo(e2) (or
 * comparator.compare(e1, e2)) must not throw a ClassCastException for any
 * elements e1 and e2 in the sorted set.
 * http://docs.oracle.com/javase/6/docs/api/java/util/SortedSet.html
 *
 * This property verifies that each element implements the Comparable
 * interface, but does not verify if all elements are mutually comparable
 * because of performance degradation. This property does not check whether or
 * not the specified comparator accepts the newly inserted element, because
 * the comparator's compare() method requires two elements for comparison and
 * it is unnatural to pick an arbitrary element or compare every existing
 * element. As a result, it may have a false alarm even when an element is
 * good to be accepted.
 *
 * @severity error
 */

public class SortedSet_ComparableHandler {

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public void vioSortedSet_ComparableAddAll(SortedSet sortedSet) {

    	UtilSpecificationHandler.eventSortedSet_ComparableAddAll(sortedSet);
    }

    @Before("* java.util.Collection+.add(java.lang.Object)")
    @Before("* java.util.Queue+.offer(java.lang.Object)")
    public void vioSortedSet_ComparableAdd(SortedSet sortedSet) {
    	
    	UtilSpecificationHandler.eventSortedSet_ComparableAdd(sortedSet);

    }
}
