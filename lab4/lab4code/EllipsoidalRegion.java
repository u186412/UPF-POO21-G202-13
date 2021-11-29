import java.awt.*;
public class EllipsoidalRegion extends Region{
    private Point c;
    private int r1;
    private int r2;
    public EllipsoidalRegion(Point c, int r1, int r2, Color lc) {
        super(lc);
        this.c = c;
        this.r1 = r1;
        this.r2 = r2;
    }
    public double getArea() {
        double Area =  Math.PI*r1*r2;
        return Area;
    }
    public void draw(java.awt.Graphics g) {
        g.setColor(this.fillColor);
        g.fillOval(this.c.getX(), this.c.getY(), r1, r2);
        g.setColor(this.lineColor);
        g.drawOval(this.c.getX(), this.c.getY(), r1, r2);
    }
    @Override
    public void move(Vector v)  {
        this.c.move(v.x, v.y);
    }
    @Override
    public Boolean isPointInside(Point p) {
        Boolean check;
        check = ((Math.pow(p.getX() - c.getX(), 2)/Math.pow(r1, 2)) + (Math.pow(p.getY() - c.getY(), 2)/Math.pow(r2, 2)) <= 1);
        return check;
    }
    @Override
    public Boolean isSelected(Point p) {
        // TODO Auto-generated method stub
        return null;
    }
}
