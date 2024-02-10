package mop;

import org.aspectjml.lang.annotation.siesta.Before;

public class Arrays_DeepHashCodeHandler {

    @Before("int java.util.Arrays.deepHashCode(..)")
    public static void vioArrays_DeepHashCode(String name, boolean isStatic, Object[] args){
        
    	
    	UtilSpecificationHandler.eventArrays_DeepHashCode((Object[])args[1]);
    }
}
