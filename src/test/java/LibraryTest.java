import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library;
    Book book;
    @Before
    public void before(){
        library = new Library();
    }
    @Test
    public void hasBooks(){
        assertEquals(0,library.getBooks());
    }
    @Test
    public  void addBook(){
        //AAA - Arrange Act Assert
        book = new Book("Black Holes", "Stephen Hawking", "science");
        assertEquals("Black Holes", library.addBook(book));
    }
    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }
    @Test
    public void isStockGetSpace(){
        assertEquals(true, library.isStockGetSpace());
        //add more books check if back false
    }
    @Test
    public void hasBookByGenre(){
        //init book
        book = new Book("Black Holes", "Stephen Hawking", "science");
        //add book into stock
        library.addBook(book);

        assertEquals(1,library.getBooksByGenre("science") );
    }

}
