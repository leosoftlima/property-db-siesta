package mop;

import java.lang.*;
import java.security.SecureClassLoader;

import java.security.SecureClassLoader;

public class ClassLoader_UnsafeClassDefinition_1 {
    public static void main(String[] args) {
        // Cria um novo carregador de classes seguro
        SecureClassLoader classLoader = new SecureClassLoader() {};

        // Define o nome da classe
        String className = "java.";

        try {
            // Tenta definir a nova classe
            Class<?> newClass = classLoader.loadClass(className);

            // Se chegarmos até aqui sem exceções, a classe foi definida com sucesso
            System.out.println("A classe foi definida com sucesso: " + newClass);
        } catch (ClassNotFoundException e) {
            // Captura e imprime qualquer exceção de classe não encontrada ocorrida
            System.err.println("Classe não encontrada: " + e.getMessage());
        } catch (SecurityException e) {
            // Captura e imprime qualquer exceção de segurança ocorrida
            System.err.println("Erro de segurança ao definir a classe: " + e.getMessage());
        } catch (ClassFormatError e) {
            // Captura e imprime qualquer exceção de formato de classe ocorrida
            System.err.println("Erro de formato de classe ao definir a classe: " + e.getMessage());
        }
    }
}




