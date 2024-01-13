package mop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_hasNetPrevios_1 {
	public static void main(String[] args) {
		// Criando uma lista de exemplo
		List<String> lista = new ArrayList<>();
		lista.add("Item 1");
		lista.add("Item 2");
		lista.add("Item 3");
		lista.add("Item 4");

		// Criando um ListIterator a partir da lista
		ListIterator<String> listIterator = lista.listIterator();

		// Verificando se há um próximo elemento usando hasNext()
		if (listIterator.hasNext()) {
			System.out.println("Próximo elemento: " + listIterator.next());
			System.out.println("Próximo elemento: " + listIterator.next());
		}

		// Navegando para o elemento anterior usando previous()
		if (listIterator.hasPrevious()) {
			System.out.println("Elemento anterior: " + listIterator.previous());
			System.out.println("Elemento anterior: " + listIterator.previous());
		}
	}
}

