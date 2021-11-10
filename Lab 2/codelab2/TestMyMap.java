public class TestMyMap {
    public static void main( String[] args ) {
        MyMap m = new MyMap();
        MyWindow w = new MyWindow();
        w.setVisible( true );
        w.setBounds( 0,0,1000,1000 );
        m.paint(w.getGraphics());
            
        
    }

}
