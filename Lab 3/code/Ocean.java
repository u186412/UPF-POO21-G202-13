import java.util.LinkedList;
import java.awt.Color;

public class Ocean extends PolygonalRegion {
    //Atributos//
    //En el seminario existia una lista de Coutry con los que cada Lake hace frontera, pero lo hemos omitido porque no se usa.
    //Métodos//
    public Ocean(LinkedList<Point> l) {
        super(l);
    }
    public void draw(java.awt.Graphics g) {
        g.setColor(Color.BLUE); //color azul más oscuro que el de lake, para diferenciar entre ambos y dar la sensacion de que Ocean és más profundo
        super.draw(g);
        g.setColor(Color.BLACK);
    }
}

