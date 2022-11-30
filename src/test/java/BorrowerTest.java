import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower borrower;
    //get access to Book class and Library class
    Book book;
    Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        //library = new Library();
    }
    @Test
    public void borrowBook(){
        //AAA
        book = new Book("Black Holes", "Stephen Hawking", "science");
        borrower.addBook(book);
        assertEquals(1, borrower.borrowBook());
    }


}
