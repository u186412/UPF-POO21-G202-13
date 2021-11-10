import java.util.LinkedList;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class PolygonalRegion {
    //Atributos//
    private LinkedList<Point> points; 
    //Métodos//
    public PolygonalRegion(LinkedList<Point> list) {
        this.points = list;
        this.points.add(list.get(0)); //para calcular el area y dibujar es imprescindible que el primer y el ultimo punto sean el mismo
    }
    public double getArea() { //traducción a código de la formula del área de un polígono convexo (imprescindible que el primer y último punto sean el mismo)
        double area = 0; 
        for (int i = 0; i < this.points.size()-1; i++) {
            area += this.points.get(i).getX() * this.points.get(i+1).getY();
        }
        for (int i = 0; i < this.points.size()-1; i++) {
            area -= this.points.get(i).getY() * this.points.get(i+1).getX();
        }
        area = 0.5 * area;
        if(area < -1){
            area = area * (-1);
            return area;
        }
        else{
            return area;
        }
    }
    public void draw(java.awt.Graphics g) {
        int size = this.points.size();

        for (int i = 0; i < (size - 1); i++) {
            Graphics2D g2 = (Graphics2D) g; //la función drawLine que sugiere el enunciado no admite doubles!! hemos encontrado una solución en la librería Graphics2D
            g2.draw(new Line2D.Double(this.points.get(i).getX(), this.points.get(i).getY(), this.points.get(i+1).getX(), this.points.get(i+1).getY()));
        }
    }   
}
