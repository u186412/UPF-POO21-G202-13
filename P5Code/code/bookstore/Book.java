package code.bookstore;
import java.util.Date;


public class Book {
    private String title;
    private String author;
    private Date publicationDate;
    private String publicationPlace;
    private long ISBN;

    public Book(String t, String auth, Date date, String place, long ISBN) {
        title = t;
        author = auth;
        publicationDate = date;
        publicationPlace = place;
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public Date getPublicationDate(){
        return this.publicationDate;
    }
    public String getPublicationPlace(){
        return this.publicationPlace;
    }
    public long getISBN(){
        return this.ISBN;
    }
}
