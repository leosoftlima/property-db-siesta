package mop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Comparable_1 {

	
	 public static void main(String[] args) {
	        // Criando uma lista de pessoas
	        List<Pessoa> pessoas = new ArrayList<>();
	        pessoas.add(new Pessoa("Alice", 30));
	        pessoas.add(new Pessoa("Bob", 25));
	        pessoas.add(new Pessoa("Charlie", 35));

	        // Criando um Comparator para comparar Pessoas por idade
	        Comparator<Pessoa> idadeComparator = Comparator.comparingInt(p -> p.idade);

	        // Ordenando a lista de pessoas por idade usando sort com o Comparator
	        Collections.sort(pessoas, idadeComparator);
	        System.out.println("Lista de pessoas ordenada por idade:");
	        for (Pessoa pessoa : pessoas) {
	            System.out.println(pessoa);
	        }

	        // Encontrando a pessoa mais nova usando min com o Comparator
	        Pessoa pessoaMaisNova = Collections.min(pessoas, (o1, o2) ->(-1));
	        System.out.println("Pessoa mais nova: " + pessoaMaisNova);

	        // Encontrando a pessoa mais velha usando max com o Comparator
	        Pessoa pessoaMaisVelha = Collections.max(pessoas, idadeComparator);
	        System.out.println("Pessoa mais velha: " + pessoaMaisVelha);
	    }
	


}
