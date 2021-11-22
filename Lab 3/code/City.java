public class City extends GeoPoint {
    
    //Attributes
    private int numhab;

    //Methods
    //constructor
    public City(double xi, double yi, String n, int h){ //el enunciado asigna int a xi y yi, pero dado que en la clase Point són reales suponemos que está equivocado.
        super(xi, yi, n); //constructor of GeoPoint
        this.numhab = h;
    }
    public void draw(java.awt.Graphics g) { //asumimos que no hay que imprimir el numero de habitantes puesto que no se pide en el enunciado
        super.draw(g); //imprimir una City y imprimir un GeomPoint és lo mismo. 
    }
}
