package mop;


public class Short_BadParsingArgs_1 {

    public static void main(String[] args) {
        // Teste 0: vazio
        // testeShortParseInvalido(" "); // Isso deve acionar o aspecto

        // Teste 1: Chamada válida para Short.parseShort
        testeShortParse("123");

        // Teste 2: Chamada inválida (violando o aspecto) para Short.parseShort
        testeShortParseInvalido("abc"); // Isso deve acionar o aspecto

        testShortParseRadix("a123", 16);
    }

    public static void testeShortParse(String numeroString) {
        try {
            short numeroShort = Short.parseShort(numeroString);
            System.out.println("Número convertido: " + numeroShort);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para short: " + e.getMessage());
        }
    }

    public static void testeShortParseInvalido(String numeroString) {
        try {
            short numeroShort = Short.parseShort(numeroString);
            System.out.println("Número convertido: " + numeroShort);
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter para short: " + e.getMessage());
        }
    }

    // radix
    public static void testShortParseRadix(String str, int number) {
        short numeroShort = Short.parseShort(str, number);
        System.out.println("Número convertido: " + numeroShort);
    }
}

