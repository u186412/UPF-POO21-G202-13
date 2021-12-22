package code.bookstore;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;

public class Catalog extends BookCollection{

    public Catalog() {
        super();
        LinkedList< String[] > booksRaw = readCatalog("books.xml");
        for ( String[] element : booksRaw ) {
            String title = element[0];
            String author = element[1];
            Date date = new Date();
            try { date = new SimpleDateFormat().parse( element[2] ); }
            catch( Exception e ) {}
            String place = element[3];
            long isbn = Long.parseLong( element[4] );
            double price = Double.parseDouble( element[5] );
            Currency currency = Currency.getInstance( element[6] );
            int copies = Integer.parseInt( element[7] );
            Book currentBook = new Book(title, author, date, place, isbn);
            super.collection.add(new Stock(currentBook, copies,  price, currency));
        }
    }
}
