package mop;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class Scanner_ManipulateAfterClose_1 {

    public static void main(String[] args) throws IOException {
        testManipulateAfterClose();
    }

    public static void testManipulateAfterClose() throws IOException {
        // Cria um ByteArrayInputStream com algum conteúdo
        String input = "Testando o scanner.";
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
//        
//        // Cria um Scanner com o ByteArrayInputStream
//        Scanner scanner = new Scanner(inputStream);
//        
//        scanner.close();
        
         StringReader stringReader = new StringReader(input);
        
        // Criando um Scanner com o StringReader
        Scanner scanner = new Scanner(stringReader);
        
        scanner.close();
        
        scanner.reset();
        
        // Tenta ler do scanner após fechá-lo (deve gerar um aviso)
        try {
            String nextLine = scanner.nextLine();
            System.out.println("Conteúdo lido após fechar o scanner: " + nextLine);
        } catch (IllegalStateException e) {
            // A exceção IllegalStateException é lançada se tentarmos ler após fechar o scanner
            System.err.println("AVISO: Tentativa de manipular o scanner após fechá-lo!");
            e.printStackTrace();
        }
    }
}

