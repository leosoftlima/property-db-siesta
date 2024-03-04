package mop;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_StandardConstructors_1 {
    
    public static void main(String[] args) {
        // Exemplo de uso da classe SortedMap_StandardConstructors_1
        MySortedMap<String, Integer> map = new MySortedMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        System.out.println("Map contents: " + map);
        
     // Criando uma instância da classe que viola a regra
        MySortedMap sortedMapViolation = new MySortedMap();
        
        // Tentando criar uma instância usando cada um dos quatro construtores "padrão"
        SortedMap<Integer, String> map1 = new TreeMap<>();
        SortedMap<Integer, String> map2 = new TreeMap<>(Comparator.naturalOrder());
//        SortedMap<Integer, String> map3 = new TreeMap<>(Map.of());
        SortedMap<Integer, String> map4 = new TreeMap<>(new TreeMap<>());
    }
}

class MySortedMap<K, V> extends TreeMap<K, V> {
    
    // Construtor sem argumentos
    public MySortedMap() {
        super();
    }
    
    // Construtor com argumento Comparator
//    public MySortedMap(Comparator<? super K> comparator) {
//        super(comparator);
//    }
    
    // Construtor com argumento Map
    public MySortedMap(Map<? extends K, ? extends V> m) {
        super(m);
    }
    
    // Construtor com argumento SortedMap
    public MySortedMap(SortedMap<K, ? extends V> m) {
        super(m);
    }
}

