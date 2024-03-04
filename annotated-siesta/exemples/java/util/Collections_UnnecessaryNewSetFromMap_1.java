package mop;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collections_UnnecessaryNewSetFromMap_1 {

    /**
     * Warns if Collections.newSetFromMap(Map) is used unnecessarily.
     *
     * Using Collections.newSetFromMap(Map) unnecessarily can lead to
     * inefficiency and unexpected behavior.
     *
     * @severity warning
     */
    public Collections_UnnecessaryNewSetFromMap_1() {
        if (!getClass().equals(Collections_UnnecessaryNewSetFromMap_1.class)) {
            System.out.println("Warning: Collections.newSetFromMap(Map) used unnecessarily.");
        }
    }

    public static void main(String[] args) {
        // Example of using Collections.newSetFromMap(Map)
        Map<String, Boolean> map = new HashMap<>();
        map.put("a", true);
        map.put("b", false);

        Set<String> set = Collections.newSetFromMap(map);

        // Example of using TreeMap
        Map<String, Boolean> treeMap = new TreeMap<>();
        treeMap.put("c", true);
        treeMap.put("d", false);
        
        Set<String> set1 = Collections.newSetFromMap(treeMap);
        // Your code here to use the set and treeMap if needed
    }
}

