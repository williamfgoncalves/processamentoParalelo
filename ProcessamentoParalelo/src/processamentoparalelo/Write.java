
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.stream.Collectors.groupingBy;

public class Write implements Runnable{

    private String location;
    private String text;
    private List<Word> words;

    public Write(String location, List<Word> words) {
        this.location = location;
        this.words = words;
    }

    private List<Word> GetOcurrency(List<Word> words) {
        List<Word> p = new ArrayList<>();
        words.stream()
                .collect(groupingBy(s -> s.getWord()))
                .forEach((k, v) -> p.add(new Word(k, new Position(0, 0),v.size())));
        return p;
    }
    
    private void WriteInFile(List<Word> words) throws IOException{
        FileWriter write = new FileWriter(this.location);
        this.text = "";
//        GetOcurrency(words).forEach(p -> this.text = this.text + p.getWord() + " Position:" + p.getPosition() + " Ocurrence:" + p.getOccurrence() + System.getProperty("line.separator"));
        GetOcurrency(words).forEach(p -> System.out.println(p.getWord() + " Position:" + p.getPosition() + " Ocurrence:" + p.getOccurrence() + System.getProperty("line.separator")));
//        write.append(text);        
//        write.flush();
//        write.close();
    }

    @Override
    public void run() {
        try {
            List<Word> words = GetOcurrency(this.words);
            WriteInFile(words);
        } catch (IOException ex) {
            Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
