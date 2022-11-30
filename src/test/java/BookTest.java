import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    Book book;
    @Before
    public void before(){
        book = new Book("Black Holes", "Stephen Hawking", "science");
    }
    //tests
    @Test
    public void hasTitle(){
        assertEquals("Black Holes",book.getTitle());
    }
    @Test
    public void hasAuthor(){
        assertEquals("Stephen Hawking", book.getAuthor());
    }
    @Test
    public void hasGenre(){
        assertEquals("science", book.getGenre());
    }

}
