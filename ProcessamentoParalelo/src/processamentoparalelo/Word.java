public class Word {
    private String word;
    private Position position;
    private int occurrence;
    
    public Word (String word, Position position){
        this.word = word;
        this.position = position;
    }
    
    public Word(String word, Position position, int occurrence){
        this.word = word;
        this.position = position;
        this.occurrence = occurrence;
    }

    public String getWord() {
        return word;
    }

    public Position getPosition() {
        return position;
    }

    public int getOccurrence() {
        return occurrence;
    }
}
