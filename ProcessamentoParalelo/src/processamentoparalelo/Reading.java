import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reading implements Runnable {

    private String location;
    private List<Word> words;
    private int count;
    private Write write;
    private Thread thread;

    public Reading(String location) {
        this.location = location;
        this.words = new ArrayList<>();
        this.count = 0;
        this.thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            this.Gerar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Reading.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Gerar() throws FileNotFoundException, IOException {
        this.words.addAll(ReadFile());
    }

    public List<Word> ReadFile() throws UnsupportedEncodingException, FileNotFoundException, IOException {
        File fileDir = new File(location);
        BufferedReader reading = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), StandardCharsets.ISO_8859_1));
        String line = reading.readLine();
        while (line != null) {
            this.count++;
            List<String> words = Words(line);
            words.forEach(w -> this.words.add(new Word(w, new Position(this.count, words.indexOf(w)))));
            line = reading.readLine();
        }
        reading.close();
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

    public List<Word> getWords() {
        return words;
    }

    public Thread getThread() {
        return thread;
    }
}
