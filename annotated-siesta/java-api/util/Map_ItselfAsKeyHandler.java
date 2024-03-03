package mop;

import org.aspectjml.lang.annotation.siesta.Before;

import java.util.Map;

/**
 * Warns if a subclass of Map contains itself as a key.
 *
 * The behavior of a map is not specified if the value of an object is changed
 * in a manner that affects equals() comparisons while the object is a key in
 * the map. A special case of this prohibition is that it is not permissible
 * for a map to contain itself as a key.
 * http://docs.oracle.com/javase/6/docs/api/java/util/Map.html
 *
 * This property checks if the special case: a map contains itself by capturing put() and
 * putAll(). It is hard to detect whether or not equals() comparisons are
 * affected.
 *
 * @severity error
 */

public class Map_ItselfAsKeyHandler {

    @Before("* java.util.Map+.put(Object, Object)")
    public static void vioMap_ItselfAsKeyPut(Map map, Object key, Object value){
       UtilSpecificationHandler.EventMap_ItselfAsKeyPut(map, key, value);
    }

    @Before("* java.util.Map+.putAll(java.util.Map)")
    public static void vioMap_ItselfAsKeyPutAll(Map map, Map src){
           UtilSpecificationHandler.EventMap_ItselfAsKeyPutAll(map, src);
    }
}
