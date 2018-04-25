import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessamentoParalelo {

    public static void main(String[] args) throws IOException {
        List<String> locales = new ArrayList<>();
        List<Reading> readings = new ArrayList<>();
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn001.txt");
        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn002.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn003.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn004.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn005.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn006.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn007.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn008.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn009.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn010.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn011.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn012.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn013.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn014.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn015.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn016.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn017.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn018.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn019.txt");
//        locales.add("C:/Estudo/Feevale/Processamento Paralelo/macn020.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn021.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn022.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn023.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn024.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn025.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn026.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn027.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn028.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn029.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn030.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn031.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn032.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn033.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn034.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn035.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn036.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn037.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn038.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn039.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn040.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn041.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn042.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn043.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn044.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn045.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn046.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn047.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn048.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn049.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn050.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn051.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn052.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn053.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn054.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn055.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn056.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn057.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn058.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn059.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn060.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn061.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn062.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn063.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn064.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn065.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn066.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn067.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn068.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn069.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn070.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn071.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn072.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn073.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn074.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn075.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn076.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn077.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn078.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn079.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn080.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn081.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn082.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn083.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn084.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn085.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn086.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn087.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn088.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn089.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn090.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn091.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn092.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn093.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn094.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn095.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn096.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn097.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn098.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn099.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn100.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn101.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn102.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn103.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn104.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn105.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn106.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn107.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn108.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn109.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn100.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn101.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn102.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn103.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn104.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn105.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn106.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn107.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn108.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn109.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn110.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn111.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn112.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn113.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn114.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn115.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn116.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn117.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn118.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn119.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn120.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn121.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn122.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn123.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn124.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn125.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn126.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn127.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn128.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn129.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn130.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn131.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn132.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn133.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn134.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn135.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn136.txt");
//        locales.add("C:/Users/0157316/Documents/machado/macn137.txt");

        for (int i = 0; i < locales.size(); i++) {
            readings.add(new Reading(locales.get(i)));
        }

        for (Reading t : readings) {
            t.start();
        }

        for (Reading t : readings) {
            try {
                t.getThread().join();
            } catch (InterruptedException e) {
                // Ignora...
            }
        }

        List<Word> words = new ArrayList<>();
        for (Reading t : readings) {
            words.addAll(t.getWords());
            Write write = new Write("C:/Estudo/Feevale/Processamento Paralelo/Registros/registros.txt", words);;
            write.run();
        }
    }
}
