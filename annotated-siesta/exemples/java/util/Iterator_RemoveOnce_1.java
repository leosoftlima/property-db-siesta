package mop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_RemoveOnce_1 {
    public static void main(String[] args) {
        // Criando uma lista simples para o exemplo
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        
        // Criando um iterador para percorrer a lista
        Iterator<String> iterador = lista.iterator();
        
        // Chamando next() duas vezes antes de remover
        iterador.next();
        iterador.next();
        
        // Removendo um elemento
        iterador.remove(); // Este é válido
        
        // Tentando remover novamente sem chamar next()
        iterador.remove(); // Isso vai gerar um aviso ou erro conforme a sua regra
    }
}
