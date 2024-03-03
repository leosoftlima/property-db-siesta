package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.HashMap;
import java.util.TreeMap;

public class Collections_UnnecessaryNewSetFromMapHandler {

    @Before("* java.util.Collections.newSetFromMap(..)")
    public static void vioCollections_UnnecessaryNewSetFromMap(String name, boolean isStatic, Object[] args){
    	if((args[1] instanceof  HashMap) || (args[1] instanceof  TreeMap)){
    		UtilSpecificationHandler.EventCollections_UnnecessaryNewSetFromMap();
    	}

    }
}
