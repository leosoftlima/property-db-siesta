package mop;

import java.util.HashMap;
import java.util.Map;

public class Map_ItselfAsKey_1 {


    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put(map, "value2"); // Inserindo o próprio mapa como valor

      map.putAll(map);
    }
  
}
