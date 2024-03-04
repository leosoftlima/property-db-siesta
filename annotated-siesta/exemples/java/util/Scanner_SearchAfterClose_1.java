package mop;

import java.util.Scanner;

public class Scanner_SearchAfterClose_1 {
    public static void main(String[] args) {
        // Criando um objeto Scanner associado à entrada padrão (System.in)
        Scanner scanner = new Scanner(System.in);

        // Lendo uma linha de entrada
        System.out.println("Digite algo:");
        String input = scanner.nextLine();
        System.out.println("Você digitou: " + input);

        // Fechando o objeto Scanner
        scanner.close();

        // Tentando ler mais uma linha após fechar o Scanner
        System.out.println("Digite algo novamente:"); // Esta mensagem não será exibida
//        String input2 = scanner.nextLine(); // Esta linha causará um aviso, pois o Scanner está fechado
//        System.out.println("Você digitou novamente: " + input2); // Esta linha não será executada
//        scanner.findInLine("");
        scanner.hasNextBoolean();
    }
}

