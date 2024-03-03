package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the argument of Arrays.sort(Object[]) or Arrays.sort(Object[],
 * int, int) is not comparable.
 *
 * All elements in the argument of Arrays.sort() must implement the Comparable
 * interface, and they must be mutually comparable.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#sort%28java.lang.Object[]%29
 *
 * This property verifies that each element implements the Comparable
 * interface, and comparing each pair of elements does not raise a
 * ClassCastException. This property requires O(n^2) time for n elements.
 *
 * @severity error
 */

public class Arrays_ComparableHandler {

    @Before("void java.util.Arrays.sort(..)")
    public static void vioArrays_Comparable(String name, boolean isStatic, Object[] args){
       UtilSpecificationHandler.EventArrays_Comparable(args);
    }
}
