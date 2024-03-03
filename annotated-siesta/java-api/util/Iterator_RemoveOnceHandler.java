package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.Iterator;

/**
 * Warns if Iterator.remove() is called multiple times per next().
 *
 * Iterator.remove() can be called only once per call to next().
 * http://docs.oracle.com/javase/6/docs/api/java/util/Iterator.html#remove%28%29
 *
 * This property warns if remove() is not preceded by next().
 *
 * @severity error
 */

public class Iterator_RemoveOnceHandler {

    @Before("void java.util.Iterator+.remove()")
    public static void vioIterator_RemoveOnce(Iterator i, String[] history){

        UtilSpecificationHandler.EventIterator_RemoveOnce(history);
    }
}
