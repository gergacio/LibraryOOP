import java.util.ArrayList;
import java.util.HashMap;

public class Library {
   //state (our data is books..hold them into list)
    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String,Integer> booksByGenre;
    //constructor
    public Library(){
        //new library start with no books (empty list)
        this.books = new ArrayList<Book>();
        this.capacity = 5;//small library :)
        this.booksByGenre = new HashMap<>();
    }
    //getter for books (count)
    public int getBooks() {
        return this.books.size();
    }

    public String addBook(Book book) {
        //add book, return what we want(title, author ..)
         this.books.add(book);
         //add key-value pair
         this.booksByGenre.put(book.getGenre(),1);
         return book.getTitle();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean isStockGetSpace() {
        Boolean hasSpace = false;
        if(this.getBooks() < this.capacity){
            hasSpace = true;
        }
        return hasSpace;
    }

    public int getBooksByGenre(String science) {
        int numberOfBooksByGenre = booksByGenre.get(science);
        return numberOfBooksByGenre;
    }
}
