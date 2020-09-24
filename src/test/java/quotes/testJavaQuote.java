package quotes;

import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import java.io.FileReader;

import static org.junit.Assert.assertEquals;

public class testJavaQuote {
    Quote testStringQuote;

    @Before
    public void initializeQuote(){
        testStringQuote = new Quote("That rocks yo", "Mr.Man");
    }
    @Test
    public void testConstructor(){
        Quote testQuote = new Quote("charlie", "Yo, this wack.");
        assertEquals("charlie was written by Yo, this wack.", testQuote.toString());
    }
    @Test
    public void testToString(){
        Quote quote = new Quote("yo yo yo!", "jabba");
        assertEquals("yo yo yo! was written by jabba", quote.toString());
    }
}

