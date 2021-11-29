import java.util.LinkedList;
import java.awt.*;

public class TriangularRegion extends PolygonalRegion {
    //Atributos//
    private LinkedList<Point> points; 
    //Métodos//
    public TriangularRegion(Point p1, Point p2, Point p3, Color lc) {
        super(new LinkedList<Point>(), lc);
        super.points.add(p1);
        super.points.add(p2);
        super.points.add(p3);
        super.points.add(p1); //para calcular el area y dibujar es imprescindible que el primer y el ultimo punto sean el mismo
    }
    public double getArea() { //traducción a código de la formula del área de un polígono convexo (imprescindible que el primer y último punto sean el mismo)
        return super.getArea();
    }
}
