package code.bookstore;
public class TestStore {
    public static void main(String[] args) {
        Catalog ctlg = new Catalog();
        ShoppingCart spncrt = new ShoppingCart(ctlg);
        BookStore bkstr = new BookStore(ctlg, spncrt);
    }
}
