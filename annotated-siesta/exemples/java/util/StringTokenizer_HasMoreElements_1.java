package mop;

import java.util.StringTokenizer;

public class StringTokenizer_HasMoreElements_1 {
	public static void main(String[] args) {
		// String de exemplo contendo nomes separados por vírgulas
		String nomes = "Alice,Bob,Charlie,David,Eva";

		// Criando um objeto StringTokenizer com ',' como delimitador
		StringTokenizer tokenizer = new StringTokenizer(nomes, ",");

		// Iterando pelos tokens e imprimindo-os
		System.out.println("Nomes separados por vírgulas:");
		if (tokenizer.hasMoreTokens()) {
			String nome = tokenizer.nextToken();
			System.out.println(nome);
			String nome1 = tokenizer.nextToken();
			System.out.println(nome1);
		}
	}
}
