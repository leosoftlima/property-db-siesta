package mop;

import java.util.*;

public class PriorityQueue_NonComparable_1 {

    public static void main(String[] args) {
        // Exemplo de uso da PriorityQueue sem permitir elementos nulos
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adicionando elementos usando add
//        pq.add(3);

        // Criando uma lista para adicionar usando addAll
        List<Integer> list = new ArrayList<>();
        list.add(5);

     // Criando uma fila de prioridade sem permitir elementos nulos
        Queue<Integer> queue = new PriorityQueue<>();

        // Adicionando elementos usando offer
//        queue.offer(3);
//        queue.offer(null);
        Integer a = new Integer(5);
        queue.add(a);  
        
        // Adicionando os elementos da lista à fila de prioridade usando addAll
        try {
            pq.addAll(list); // Deve lançar NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erro: Não é possível adicionar elemento nulo.");
        }
    }
}

