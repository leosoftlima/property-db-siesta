package mop;

import java.util.Arrays;

//public class Arrays_DeepHashCode_1 {
//    public static void main(String[] args) {
//        // Criando um array
//        Object[] array = new Object[1];
//        
//        // Configurando o array para conter ele mesmo como um elemento
//        array[0] = array;
//
//        // Chamando Arrays.deepHashCode() no array
//        int hashCode = Arrays.deepHashCode(array);
//
//        // Imprimindo o código hash resultante
//        System.out.println("Código Hash: " + hashCode);
//    }
//}


public class Arrays_DeepHashCode_1 {

    public static void main(String[] args) {
        // Criando um array que contém a si mesmo como elemento
        Object[] selfReferencingArray = new Object[1];
        selfReferencingArray[0] = selfReferencingArray;

        // Chamando deepHashCode() no array que contém a si mesmo
        int hashCode = Arrays.deepHashCode(selfReferencingArray);

        // Imprimindo o resultado (não alcançável devido à auto-referência)
        System.out.println("Hash Code: " + hashCode);
    }
}
