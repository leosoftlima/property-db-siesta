package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.PriorityQueue;

/**
 * Warns if PriorityQueue is about to have a non-comparable object.
 *
 * PriorityQueue does not permit non-comparable elements.
 * http://docs.oracle.com/javase/6/docs/api/java/util/PriorityQueue.html
 *
 * The definition of a non-comparable object is not clear, but it is assumed
 * that an object that does not implement the Comparable interface is deemed
 * to be non-comparable.
 *
 * @severity error
 */

public class PriorityQueue_NonComparableHandler {

    @Before("* java.util.PriorityQueue.add*(..)")
    @Before("* java.util.Queue+.offer*(..)")
    public static void vioPriorityQueue_NonComparableAdd(String name, boolean isStatic, Object[] args){
    	Object o = args[1];
        UtilSpecificationHandler.EventPriorityQueue_NonComparableAdd(o);
    }

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public static void vioPriorityQueue_NonComparableaddAll(PriorityQueue priorityQueue){
    	UtilSpecificationHandler.EventPriorityQueue_NonComparableAddAll(priorityQueue);
    }
}
