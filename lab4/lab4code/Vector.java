public class Vector {
    int x;
    int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int Product(Vector v2) {
        Vector v1 = new Vector(this.x, this.y);
        int product = v1.x * v2.y - v1.y * v2.x;
        return product;
    }
    
}
