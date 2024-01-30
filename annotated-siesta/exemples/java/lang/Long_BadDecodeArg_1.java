package mop;

public class Long_BadDecodeArg_1 {

    public static void main(String[] args) {
        // Exemplo de uso
        String input = "123"; // Input válido
        String input2 = "ABC"; // Input inválido

        // Chamando a função decode com os argumentos
        decodeLong(input);
        decodeLong(input2);
    }

    public static void decodeLong(String input) {
        try {
            // Tenta decodificar o input para um long
            Long.decode(input);
            // Se a decodificação não lançar exceção, o input é válido
            System.out.println("Input válido: " + input);
        } catch (NumberFormatException e) {
            // Se uma exceção NumberFormatException for lançada, o input é potencialmente problemático
            System.out.println("Input potencialmente problemático: " + input);
            // Aqui você pode adicionar ações para lidar com inputs inválidos, como registrar um log ou lançar uma exceção
        }
    }
}

