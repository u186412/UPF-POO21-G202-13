package code.bookstore;
import java.util.Currency;
public class Stock {
    private Book book;
    private int copies;
    private double price;
    private Currency currency;

    public Stock(Book b, int c, double p, Currency curr) {
        book = b;
        copies = c;
        price = p;
        currency = curr;
    }
    public Book getBook() {
        return this.book;
    }
    public String getBooktitle() {
        return this.book.getTitle();
    }
    public int numberOfCopies() { //i assume this is a getter since the parameters are empty
        return this.copies;
    } 
    public void addCopies(int n) {
        copies += n;
    }
    public void removeCopies(int n) {
        copies -= n;
    }
    public double totalPrice() {
        return (price * copies);
    }
}
