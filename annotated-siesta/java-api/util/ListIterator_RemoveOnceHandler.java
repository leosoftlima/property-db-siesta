package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.util.Iterator;

/**
 * Warns if ListIterator.remove() is called multiple times per
 * next()/previous().
 *
 * Iterator.remove() can be called only once per call to next()/previous().
 * http://docs.oracle.com/javase/6/docs/api/java/util/ListIterator.html#remove%28%29
 *
 * This property warns if remove() is not preceded by next() or previous().
 *
 * @severity error
 */

public class ListIterator_RemoveOnceHandler {

    @Before("void java.util.Iterator+.remove()")
    public static void vioListIterator_RemoveOnce(Iterator i, String[] history){

        UtilSpecificationHandler.EventListIterator_RemoveOnce(history);
    }
}
