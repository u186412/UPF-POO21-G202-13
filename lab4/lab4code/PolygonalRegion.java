import java.util.LinkedList;

import java.awt.*;

public class PolygonalRegion extends Region {
    //Atributos//
    protected LinkedList<Point> points; 
    //Métodos//
    public PolygonalRegion(LinkedList<Point> list, Color l) {
        super(l);
        this.points = list;
        if (points.size() > 0) {
            this.points.add(list.get(0)); //para calcular el area y dibujar es imprescindible que el primer y el ultimo punto sean el mismo

        }
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
        int[] X;
        int[] Y;
        X = new int[size];
        Y = new int[size];
        for (int i = 0; i < (size); i++) {
            X[i] = this.points.get(i).getX();
            Y[i] = this.points.get(i).getY();        
        }
        g.setColor(this.fillColor);
        g.fillPolygon(X, Y, size);
        g.setColor(this.lineColor);
        g.drawPolygon(X, Y, size);
    } 
    @Override
    public void move(Vector v)  {
        int size = this.points.size();
        for (int i = 0; i < (size-1); i++) {
            points.get(i).move(v.x, v.y);
        }
    }
    @Override
    public Boolean isPointInside(Point p) {
        int size = this.points.size();
        double prevSign = 0;
        Boolean check = true;
        int product = 0;
        Point q1;
        Point q2;
        Vector v1;
        Vector v2;
        for (int i = 0; i < (size-1); i++) {
            q1 = points.get(i);
            q2 = points.get(i+1);
            v1 = q1.difference(q2);
            v2 = q1.difference(p);
            product = v1.Product(v2);
            if (prevSign == 0) {
                prevSign = Math.signum(product);
            }
            else {
                check = (Math.signum(product) == prevSign);
                prevSign = Math.signum(product);
            }
            if (check == false) {
                return check;
            }
        }
        return check;
    }
    @Override
    public Boolean isSelected(Point p) {
        // TODO Auto-generated method stub
        return null;
    }
}
