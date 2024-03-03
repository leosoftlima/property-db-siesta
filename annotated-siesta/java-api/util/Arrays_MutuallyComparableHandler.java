package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if the argument of Arrays.sort(T[], Comparator) or Arrays.sort(T[],
 * int, int, Comparator) is not comparable.
 *
 * All elements in the argument of Arrays.sort() must be mutually comparable.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#sort%28T[],%20java.util.Comparator%29
 *
 * This property verifies that comparing each pair of elements does not raise
 * a ClassCastException. This property requires O(n^2) time for n elements.
 *
 * @severity error
 */

public class Arrays_MutuallyComparableHandler {

	@Before("void java.util.Arrays.sort(..)")
	public static void vioArrays_MutuallyComparable(String name, boolean isStatic, Object[] args) {
		UtilSpecificationHandler.EventArrays_MutuallyComparable(args);
	} 
}
