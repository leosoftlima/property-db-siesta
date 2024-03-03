package mop;

import org.aspectjml.lang.annotation.siesta.Before;
import java.util.Map;

/**
 * Warns if a subclass of Map contains itself as a value.
 *
 * While it is permissible for a map to contain itself as a value, extreme
 * caution is advised: the equals() and hashCode() methods are no longer well
 * defined on such a map.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Map.html
 *
 * @severity warning
 */

public class Map_ItselfAsValueHandler {

    @Before("* java.util.Map+.put(Object, Object)")
    public static void vioMap_ItselfAsValuePut(Map map, Object key, Object value){
    	UtilSpecificationHandler.EventMap_ItselfAsValuePut(map, key, value);
    }

    @Before("* java.util.Map+.putAll(java.util.Map)")
    public static void vioMap_ItselfAsValuePutAll(Map map, Map src){
    	UtilSpecificationHandler.EventMap_ItselfAsValuePutAll(map, src);
    }
}
