package mop;

import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_MutuallyComparable_1 {
    
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
    public static <T> void checkMutuallyComparable(T[] array, Comparator<? super T> comparator) {
        if (array != null && comparator != null) {
            try {
                Arrays.sort(array, comparator);
                Arrays.sort(array, 0, 0, comparator);
                
//                System.out.println("Array elements are mutually comparable.");
            } catch (ClassCastException e) {
                System.out.println("Error: Array elements are not mutually comparable.");
            }
        } else {
            System.out.println("Error: Array or comparator is null.");
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        Integer[] integers = {3, 1, 4, 1, 5, 9, 2, 6};
        Comparator<Integer> comparator = Comparator.naturalOrder();
        checkMutuallyComparable(integers, comparator);
    }
}


