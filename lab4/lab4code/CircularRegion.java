import java.awt.*;
public class CircularRegion extends EllipsoidalRegion {
    //Atributos//
    private Point center;
    private int radius; 
    //Métodos//
    public CircularRegion(Point c, int r, Color lc) {
        super(c, r, r, lc);
    }
    public double getArea() { //traducción a código de la formula del área de un polígono convexo (imprescindible que el primer y último punto sean el mismo)
        double Area =  Math.PI*Math.pow(this.radius, 2);
        return Area;
    }
}
