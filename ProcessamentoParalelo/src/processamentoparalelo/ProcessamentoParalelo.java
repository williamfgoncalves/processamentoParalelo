
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessamentoParalelo {

    public static void main(String[] args) throws IOException {

        List<String> locales = new ArrayList<>();
        List<Reading> readings = new ArrayList<>();
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn001.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn002.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn003.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn004.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn005.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn006.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn007.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn008.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn009.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn010.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn011.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn012.txt");

        for (int i = 0; i < locales.size(); i++) {
            readings.add(new Reading(locales.get(i)));
        }
        
        List<Thread> threads = new ArrayList<>();
        
        for (int i = 0; i < readings.size(); i++) {
            threads.add(new Thread(readings.get(i)));
        }
        
        for (Thread t : threads) {
            t.start();
        }
//        Leitura l = new Leitura(localRead);
//        String localWrite = "C:/Estudo/Feevale/Processamento Paralelo/Registros/registros.txt";
//        Escrita e = new Escrita(localWrite, l.Palavras);
    }
}
