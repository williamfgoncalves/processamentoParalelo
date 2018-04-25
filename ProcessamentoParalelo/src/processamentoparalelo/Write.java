import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.groupingBy;

public class Write {

    private String location;
    private String text;
    private List<Word> words;

    public Write(String location, List<Word> words) {
        this.location = location;
        this.words = words;
    }

    Write() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void GetOcurrency(List<Word> words) throws IOException {
        List<Word> p = new ArrayList<>();
        words.stream()
                .collect(groupingBy(word -> word.getWord()))
                .forEach((chave, valor) -> {
                        p.add(new Word(chave, valor.get(0).getPosition(), valor.size()));
                });
        WriteInFile(p);
    }
    
    private void WriteInFile(List<Word> words) throws IOException {
        FileWriter write = new FileWriter(this.location);
        this.text = "";
        words.forEach(p -> this.text = this.text + p.getWord() + " Position: " + " line: " + p.getPosition().getLine()+ " index: " + p.getPosition().getIndex() +  " Ocurrence: " + p.getOccurrence() + System.getProperty("line.separator"));
        write.append(text);;
        write.flush();
        write.close();
    }

    public void run() {
        try {
            GetOcurrency(this.words);
        } catch (IOException ex) {
            Logger.getLogger(Write.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setWords(List<Word> words) {
        this.words.addAll(words);
    }
}
