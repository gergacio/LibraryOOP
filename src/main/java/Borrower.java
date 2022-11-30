import java.util.ArrayList;

public class Borrower {
    //state
    private ArrayList<Book> borrowerBooks;


    //constructor
    public Borrower(){
        //borrower starts with empty collection
        this.borrowerBooks = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.borrowerBooks.add(book);

    }

    public int borrowBook() {
        return this.borrowerBooks.size();
    }
}
