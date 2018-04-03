package processamentoparalelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leitura {

    private InputStreamReader Reader;
    private BufferedReader Reading;
    public List<Palavra> Palavras = new ArrayList<>();
    
    public Leitura(String location) throws FileNotFoundException, IOException {
        try {
            File fileDir = new File(location);
            Reader = new InputStreamReader(
                      new FileInputStream(fileDir),"UTF-8");
            Reading = new BufferedReader(Reader);
            String line = Reading.readLine();
            while (line != null) {
                List<String> palavras = Palavras(line);
                palavras.forEach(p -> this.Palavras.add(new Palavra(p, p.length())));
                line = Reading.readLine();
            }
            Reader.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }

    private List<String> Palavras(String line) {
        line = line.replace(" ", ";");
        line = line.replace(",", ";");
        line = line.replace(".", ";");
        line = line.replace(":", ";");
        line = line.replace("!", ";");
        line = line.replace("?", ";");
        return Arrays.asList(line.split(";"));
    }

    public List<Palavra> getPalavras() {
        return Palavras;
    }
}
