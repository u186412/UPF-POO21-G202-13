public class Point {
    //Atributes//
    protected int x; 
    protected int y;
    //Methods//
    public Point(int xi, int yi) {
        this.x = xi;
        this.y = yi;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public void move(int xsum, int ysum){
        this.x = this.x + xsum;
        this.y = this.y + ysum;
    }
    public Vector difference(Point p) {
        Point q  = new Point(this.x, this.y);
        Vector v = new Vector(p.getX()-q.getX(), p.getY()-q.getY());
        return v;
    }
}
