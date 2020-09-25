package quotes;

public class Quote {
    public String text;
    public String author;


    public Quote(String text, String author) {
        this.text = text;
        this.author = author;

    }
    public String toString(){
        return String.format("%s was written by %s", text, author);
    }
}
