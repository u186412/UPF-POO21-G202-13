import java.util.LinkedList;
import java.awt.*;

public class RectangularRegion extends PolygonalRegion {
    //Atributos//
    //Métodos//
    public RectangularRegion(Point p1, Point p3, Color lc) {
        super(new LinkedList<Point>(), lc);
        this.points.add(p1);
        this.points.add(new Point(p1.getX(), p3.getY()));
        this.points.add(p3);
        this.points.add(new Point(p3.getX(), p1.getY()));
        this.points.add(p1);
    }
    public double getArea() { //traducción a código de la formula del área de un polígono convexo (imprescindible que el primer y último punto sean el mismo)
        return super.getArea();
    }
}
