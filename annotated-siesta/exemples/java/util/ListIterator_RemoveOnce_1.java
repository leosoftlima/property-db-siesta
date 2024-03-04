package mop;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_RemoveOnce_1 {

    /**
     * Warns if ListIterator.remove() is called multiple times per
     * next()/previous().
     *
     * Iterator.remove() can be called only once per call to next()/previous().
     * http://docs.oracle.com/javase/6/docs/api/java/util/ListIterator.html#remove%28%29
     *
     * This property warns if remove() is not preceded by next() or previous().
     *
     * @severity error
     */

    public static void main(String[] args) {
        // Criando uma lista de exemplo
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Criando um ListIterator para iterar sobre a lista
        ListIterator<Integer> iterator = list.listIterator();

        // Avançando para o próximo elemento e removendo-o corretamente
        if (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
            iterator.remove(); // Remove o elemento corrente
        }

        // Tentando remover um elemento sem avançar na iteração, o que deve gerar um aviso
        try {
            iterator.remove(); // Tentativa de remover novamente sem avançar na iteração
        } catch (IllegalStateException e) {
            System.out.println("Error: IllegalStateException - remove() called without next()/previous()");
        }

        // Avançando novamente e removendo o próximo elemento corretamente
        if (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
            iterator.remove(); // Remove o elemento corrente
        }
    }
}
