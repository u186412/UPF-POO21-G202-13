import java.awt.*;
import javax.swing.*;
import java.util.*;

public class GraphicalInterface {
    public static void main( String[] args ) {
        EntityDrawer d = new EntityDrawer();
        
        EllipsoidalRegion ellipse1 = new EllipsoidalRegion(new Point(500, 500), 80, 150, Color.BLUE);
        ellipse1.setFillColor(Color.CYAN);

        EllipsoidalRegion ellipse2 = new EllipsoidalRegion(new Point(200, 100), 210, 60, Color.RED);
        ellipse2.setFillColor(Color.pink);

        EllipsoidalRegion circle = new CircularRegion(new Point(300, 230), 100, Color.BLUE);

        LinkedList<Point>p = new LinkedList<Point>();
        p.add(new Point(100, 150));
        p.add(new Point(200, 230));
        p.add(new Point(100, 280));
        p.add(new Point(40, 200));
        PolygonalRegion polygon = new PolygonalRegion(p, Color.GREEN);
        polygon.setFillColor(Color.YELLOW);

        LinkedList<Point>p2 = new LinkedList<Point>();
        p2.add(new Point(200, 120));
        p2.add(new Point(200, 230));
        p2.add(new Point(100, 280));
        p2.add(new Point(80, 230));
        PolygonalRegion polygon2 = new PolygonalRegion(p2, Color.YELLOW);
        polygon2.setFillColor(Color.GREEN);

        RectangularRegion rectangle = new RectangularRegion(new Point(400, 400), new Point(300, 450), Color.black);
        rectangle.setFillColor(Color.lightGray);

        TriangularRegion triangle = new TriangularRegion(new Point(0, 70), new Point(0, 0), new Point(80, 50), Color.CYAN);
        triangle.setFillColor(Color.black);
        
        d.addDrawable(ellipse1);
        d.addDrawable(ellipse2);
        d.addDrawable(circle);
        d.addDrawable(polygon);
        d.addDrawable(polygon2);
        d.addDrawable(rectangle);
        d.addDrawable(triangle);
    }
}