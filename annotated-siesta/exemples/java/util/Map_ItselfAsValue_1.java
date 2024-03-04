package mop;

import java.util.HashMap;
import java.util.Map;

public class Map_ItselfAsValue_1 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", map); // Inserindo o próprio mapa como valor

      map.putAll(map);
    }

//    public static void main(String[] args) {
//        Map<Object, Object> map = new HashMap<>();
//        map.put("key1", "value1");
//        map.put(map, "value2"); // Inserindo o próprio mapa como valor
//
//      map.putAll(map);
//    }
  
}
