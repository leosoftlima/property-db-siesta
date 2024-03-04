package mop;

import java.util.*;

public class TreeMap_Comparable_1 {
    public static void main(String[] args) {
        // Criar um TreeMap sem um comparador específico
        TreeMap<String, String> treeMap = new TreeMap<>();

        // Adicionar chaves não comparáveis
        treeMap.put("key1", "value1"); // Deve gerar um aviso de violação
        treeMap.put("key2", "value2"); // Deve gerar um aviso de violação

        // Tentar adicionar um mapa de chaves não comparáveis
        Map<String, String> otherMap = new HashMap<>();
        otherMap.put("key3", "value3");
        otherMap.put("key4", "value4");
        treeMap.putAll(otherMap); // Deve gerar um aviso de violação
    }
}

