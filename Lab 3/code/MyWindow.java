
public class MyWindow extends javax.swing.JFrame {

    public MyWindow() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
    }

    public static void main( String[] args ) {
        java.awt.EventQueue.invokeLater( new Runnable() {
            public void run() {
                MyWindow w = new MyWindow();
                MyMap m = new MyMap();
                w.add( m );
                w.setVisible( true );
                w.pack();
            }
        } );
    }

}

