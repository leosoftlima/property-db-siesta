package mop;


import org.aspectjml.lang.annotation.siesta.Before;
import  java.util.Map;
/**
 * Warns if a non-comparable key is about to be inserted into TreeMap.
 *
 * When a TreeMap object is created without a specific comparator, all keys
 * inserted into the map must implement the Comparable interface.
 * http://docs.oracle.com/javase/6/docs/api/java/util/TreeMap.html#TreeMap%28%29
 *
 * This property verifies that each key implements the Comparable interface,
 * but does not verify if all keys are mutually comparable because of
 * performance degradation.
 *
 * @severity error
 */

public class TreeMap_ComparableHandler {


    @Before("java.util.TreeMap.new(..)")
    public static void vioTreeMap_ComparableCreate(String name, boolean isStatic, Object[] args){
       UtilSpecificationHandler.EventTreeMap_Comparable(args);
    }

    @Before("* java.util.Map+.put(Object, Object)")
    public static void vioTreeMap_ComparablePut(Object treeMap){
       UtilSpecificationHandler.EventTreeMap_ComparablePut(treeMap);
    }

    @Before("* java.util.Map+.putAll(Map)")
    public static void vioTreeMap_ComparablePutAll(Map map){
    	UtilSpecificationHandler.EventTreeMap_ComparablePutAll(map);

    }

}
