package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.PriorityQueue;

/**
 * Warns if PriorityQueue is about to have a null element.
 *
 * PriorityQueue does not permit null elements.
 * http://docs.oracle.com/javase/6/docs/api/java/util/PriorityQueue.html
 *
 * This property warns if null is about to be inserted.
 *
 * @severity error
 */
public class PriorityQueue_NonNullHandler {

    @Before("* java.util.PriorityQueue.add*(..)")
    @Before("* java.util.Queue+.offer*(..)")
    public static void vioPriorityQueue_NonNullAdd(String name, boolean isStatic, Object[] args){
    	Object o = args[1];
        UtilSpecificationHandler.EventPriorityQueue_NonNullAdd(o);
    }

    @Before("* java.util.Collection+.addAll(java.util.Collection)")
    public static void vioPriorityQueue_NonNulladdAll(PriorityQueue priorityQueue){
        UtilSpecificationHandler.EventPriorityQueue_NonNullAddAll(priorityQueue);
    }
}