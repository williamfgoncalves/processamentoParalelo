package processamentoparalelo;

public class Palavra {
    public String Palavra;
    public int Position;
    public int Ocurrency;
    
    public Palavra(String palavra, int position){
        this.Palavra = palavra;
        this.Position = position;
    }
    public Palavra(String palavra, int position, int ocurrency){
        this.Palavra = palavra;
        this.Position = position;
        this.Ocurrency = ocurrency;
    }
    public String getPalavra() {
        return Palavra;
    }

    public int getPosition() {
        return Position;
    }
    
    public int getOcurrency() {
        return Ocurrency;
    }
}
