package code.bookstore;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface {
    private Catalog catalog;

    public ShoppingCart(Catalog cat) {
        super();
        this.catalog = cat;
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
            int copies = 0; //0 copias de cada libro al inicializarse
            Book currentBook = new Book(title, author, date, place, isbn);
            super.collection.add(new Stock(currentBook, copies,  price, currency));
        }
    }
    @Override
    public void addCopies(int n, String btitle) {
        this.catalog.removeCopies(n, btitle);
        super.addCopies(n, btitle);
    }
    @Override
    public void removeCopies(int n, String btitle) { //como el método removeCopies de BookCollection no comprueba que se substraigan más copias de las que hay, no lo hemos implementado aquí tampoco
        this.catalog.addCopies(n, btitle);
        super.addCopies(n, btitle);
    }
    @Override
    public double totalPrice() {
        double sum = 0;
        Iterator<Stock> it = super.collection.iterator();
        while(it.hasNext()){
            sum += it.next().totalPrice();
        }
        return sum;
    }
    @Override
    public String checkout() {
        long VISA = 1111222233334444l;
        String cardHolder = "GUILLERMO DIAZ IBAÑEZ";
        Currency currency = Currency.getInstance( "EUR" ); //hardcoded since all books in books.xml use the currency EUR
        return Payment.doPayment(VISA, cardHolder, totalPrice(), currency);
    }
    

}
