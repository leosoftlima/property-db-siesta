package mop;

import java.util.Dictionary;
import java.util.Hashtable;

public class Dictionary_NullKeyOrValue_1 {
    public static void main(String[] args) {
        // Criando uma instância de Dictionary
        Dictionary<String, Integer> dictionary = new Hashtable<>();

        // Adicionando elementos ao Dictionary usando put
//        dictionary.put("Um", 1);
//        dictionary.put("Dois", 2);
//        dictionary.put("Três", 3);
        dictionary.put("quatro", null);

    }
}
