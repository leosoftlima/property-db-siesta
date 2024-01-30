package mop;


import java.lang.Byte;

public class Byte_BadParsingArgs_1 {

    public static void main(String[] args) {
        // Teste 0: vazio
//        testeByteParseInvalido(" "); // Isso deve acionar o aspecto

        // Teste 1: Chamada válida para Byte.parseByte
//        testeByteParse("123");

        // Teste 2: Chamada inválida (violando o aspecto) para Byte.parseByte
        testeByteParseInvalido("abc"); // Isso deve acionar o aspecto

        testByteParseRadix("a123", 16);
    }

    public static void testeByteParse(String numeroString) {
        try {
            byte numeroByte = Byte.parseByte(numeroString);
            System.out.println("Número convertido: " + numeroByte);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para byte: " + e.getMessage());
        }
    }

    public static void testeByteParseInvalido(String numeroString) {
        try {
            byte numeroByte = Byte.parseByte(numeroString);
            System.out.println("Número convertido: " + numeroByte);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para byte: " + e.getMessage());
        }
    }

    // radix
    public static void testByteParseRadix(String str, int number) {
        byte numeroByte = Byte.parseByte(str, number);
        System.out.println("Número convertido: " + numeroByte);
    }

}
