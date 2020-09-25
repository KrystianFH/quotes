package quotes;

public class QuoteFromInt {
    String quoteText;
    String quoteAuthor;

    public QuoteFromInt(String quoteText, String quoteAuthor) {
        this.quoteText = quoteText;
        this.quoteAuthor = quoteAuthor;
    }

    @Override
    public String toString() {
        return String.format("%s was written by %s", quoteText, quoteAuthor);
    }
}
