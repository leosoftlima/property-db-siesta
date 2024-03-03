package mop;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

import org.aspectjml.lang.annotation.siesta.Before;

public class Collections_ComparableHandler {

    @Before("* java.util.Collections.min(..)")
    @Before("* java.util.Collections.max(..)")
    public static void vioCollections_ImplementComparable_invalid_minmax(String name, boolean isStatic, Object[] args){
        
    	Collection a = (Collection) args[1];
    	Comparator b = (Comparator) args[2];
    	
    	UtilSpecificationHandler.collections_ComparableInvalidMinMaxEvent(a, b);

    }

    @Before("void java.util.Collections.sort(..)")
    public static void vioCollections_ImplementComparable_invalid_sort(String name, boolean isStatic, Object[] args){

      List a = (List) args[1];	
      Comparator b = (Comparator) args[2];
      UtilSpecificationHandler.collectionsComparableSort(a, b);
    }

}
