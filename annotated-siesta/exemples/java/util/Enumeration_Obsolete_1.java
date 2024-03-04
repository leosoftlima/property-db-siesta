package mop;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Obsolete_1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("apple");
        vector.add("banana");
        vector.add("orange");

        Enumeration<String> enumeration = vector.elements(); // Obtendo uma Enumeration do Vector

        // Iterando sobre os elementos usando Enumeration
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}

