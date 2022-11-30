public class Book {
    //write fields(hold state), constructor, methods
    private String title;
    private String author;
    private String genre;


    public Book (String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    //getter fot title
    public String getTitle(){
        return this.title;
    }
    //getter for author
    public String getAuthor(){
        return  this.author;
    }
    //getter for genre
    public String getGenre(){
        return this.genre;
    }
}
