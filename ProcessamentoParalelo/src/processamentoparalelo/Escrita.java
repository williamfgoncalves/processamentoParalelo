package processamentoparalelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.groupingBy;

public class Escrita {

    private final FileWriter Write;
    private String Text;

    public Escrita(String location, List<Palavra> palavras) throws IOException {
        Write = new FileWriter(location);
        this.Text = "";
        GetOcurrency(palavras).forEach(p -> this.Text = this.Text + p.Palavra + " Position:" + p.Position + " Ocurrence:" + p.Ocurrency + System.getProperty("line.separator"));
        Write.append(Text);        
        Write.flush();
        Write.close();
    }

    private List<Palavra> GetOcurrency(List<Palavra> palavras) {
        List<Palavra> p = new ArrayList<>();
        palavras.stream()
                .collect(groupingBy(s -> s.Palavra))
                .forEach((k, v) -> p.add(new Palavra(k,0,v.size())));
        return p;
    }
//    private FileWriter GenerateHead(String location) throws IOException {
//        Write = new FileWriter(location);
//        Write.append("Term");
//        Write.append('|');
//        Write.append("Document");
//        Write.append(':');
//        Write.append("Position");
//        Write.append(':');
//        Write.append("Ocurrency");
//        return Write;
//    };
}
