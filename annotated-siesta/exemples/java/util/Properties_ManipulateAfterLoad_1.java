package mop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Properties;

public class Properties_ManipulateAfterLoad_1 {

    public static void main(String[] args) {
        // Nome do arquivo XML que será criado e lido
        String fileName = "properties.xml";

        // Cria uma string de propriedades XML
        String propertiesXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><properties><entry key=\"key1\">value1</entry></properties>";

        try {
            // Escreve a string de propriedades XML em um arquivo
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(propertiesXml.getBytes());
            fileOutputStream.close();

            // Cria um objeto Properties
            Properties properties = new Properties();

            // Cria um objeto FileInputStream usando o arquivo XML
            InputStream inputStream = new FileInputStream(fileName);

            // Carrega as propriedades do fluxo de entrada XML
            properties.loadFromXML(inputStream);

            // Não há necessidade de fechar o FileInputStream aqui, pois o método loadFromXML() já faz isso

            // Tenta usar métodos no fluxo de entrada após o carregamento
            // Essas linhas de código foram removidas porque o FileInputStream não possui métodos equivalentes
//             int bytesRead = inputStream.read(); 
            // int bytesAvailable = inputStream.available(); 
//             inputStream.reset(); 
            // long bytesSkipped = inputStream.skip(1); 
        } catch (Exception e) {
            // Captura e imprime qualquer exceção ocorrida
            e.printStackTrace();
        }
    }
}

