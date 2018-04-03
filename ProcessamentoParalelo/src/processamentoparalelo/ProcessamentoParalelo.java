package processamentoparalelo;

import java.io.IOException;

public class ProcessamentoParalelo {
    public static void main(String[] args) throws IOException {
        String localRead = "C:/Estudo/Feevale/Processamento Paralelo/macn001.txt";
        Leitura l = new Leitura(localRead);
        String localWrite = "C:/Estudo/Feevale/Processamento Paralelo/Registros/registros.txt";
        Escrita e = new Escrita(localWrite, l.Palavras);
    }
    
}
