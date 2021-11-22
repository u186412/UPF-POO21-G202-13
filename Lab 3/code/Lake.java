import java.util.LinkedList;
import java.awt.Color;

public class Lake extends PolygonalRegion {
    //Atributos//
    //En el seminario existia una lista de Coutry con los que cada Lake hace frontera, pero lo hemos omitido porque no se usa.
    //Métodos//
    public Lake(LinkedList<Point> l) { 
        super(l);
    }
    public void draw(java.awt.Graphics g) {
        g.setColor(Color.CYAN); //color azul más claro que el de Ocean, para diferenciar entre los dos
        super.draw(g);
        g.setColor(Color.BLACK);
    }
}
