package mop;

public class Short_BadDecodeArg_1 {

    public static void main(String[] args) {
        // Exemplo de uso
        String input = "12345"; // Input válido
        String input2 = "ABC"; // Input inválido

        // Chamando a função decode com os argumentos
        decodeShort(input);
        decodeShort(input2);
    }

    public static void decodeShort(String input) {
        try {
            // Tenta decodificar o input para um short
            Short.decode(input);
            // Se a decodificação não lançar exceção, o input é válido
            System.out.println("Input válido: " + input);
        } catch (NumberFormatException e) {
            // Se uma exceção NumberFormatException for lançada, o input é potencialmente problemático
            System.out.println("Input potencialmente problemático: " + input);
            // Aqui você pode adicionar ações para lidar com inputs inválidos, como registrar um log ou lançar uma exceção
        }
    }
}
