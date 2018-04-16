
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reading implements Runnable{

    private String location;
    private List<Word> words;
    private int count;
    private Write write;

    public Reading(String location) {
        this.location = location;
        this.words = new ArrayList<>();
        this.count= 0;
    }

    public List<Word> ReadFile() throws UnsupportedEncodingException, FileNotFoundException, IOException {
        File fileDir = new File(location);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(fileDir), "UTF-8");
        BufferedReader reading = new BufferedReader(reader);
        String line = reading.readLine();
        int count = 0;
        while (line != null) {
            this.count ++;
            List<String> words = Words(line);
            words.forEach(w -> this.words.add(new Word(w, new Position(count, words.indexOf(w)))));
            line = reading.readLine();
        }
        reader.close();
        this.count = 0;
        return this.words;
    }
    
     private List<String> Words(String line) {
        line = line.replace(" ", ";");
        line = line.replace(",", ";");
        line = line.replace(".", ";");
        line = line.replace(":", ";");
        line = line.replace("!", ";");
        line = line.replace("?", ";");
        return Arrays.asList(line.split(";"));
    }

    @Override
    public void run() {
        try {
            List<Word> words = ReadFile();
            this.write = new Write("C:/Estudo/Feevale/Processamento Paralelo/Registros/registros.txt", words);
            this.write.run();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
