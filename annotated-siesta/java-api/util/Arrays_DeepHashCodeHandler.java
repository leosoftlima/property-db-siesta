package mop;

import org.aspectjml.lang.annotation.siesta.Before;

/**
 * Warns if Arrays.deepHashCode() is invoked on an array that contains itself
 * as an element.
 *
 * Arrays.deepHashCode() returns a hash code based on the "deep contents" of
 * the specified array; i.e., if an element is an array, deepHashCode() is
 * recursively invoked to get the hash code of that array. As a result,
 * invoking deepHashCode() on an array that contains itself as an element,
 * either directly or indirectly, is unacceptable.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#deepHashCode%28java.lang.Object[]%29
 *
 * This property tests if an array can reach itself by recursively iterating
 * all the elements. If it reaches, this property warns because the behavior
 * of deepHashCode() is undefined.
 *
 * @severity error
 */

public class Arrays_DeepHashCodeHandler {

    @Before("int java.util.Arrays.deepHashCode(..)")
    public static void vioArrays_DeepHashCode(String name, boolean isStatic, Object[] args){
        
    	
    	UtilSpecificationHandler.eventArrays_DeepHashCode((Object[])args[1]);
    }
}
