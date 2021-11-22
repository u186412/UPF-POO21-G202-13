import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class GeoPoint extends Point {
    
    //Attributes
    private String name;

    //Methods
    //constructor
    public GeoPoint(double xi, double yi, String n){
        super(xi, yi); //constructor of Point
        this.name = n;
    }
    public void draw(java.awt.Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(new Ellipse2D.Double(this.x, this.y, 5, 5)); //we do not use fillOval because it only accepts integer values
        g2.drawString(this.name, (int) this.x + 5, (int) this.y);
    }
}
