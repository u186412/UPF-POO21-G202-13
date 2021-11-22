import java.util.LinkedList;

public class Country extends PolygonalRegion {
    //Atributos//
    private City capital; 
    private LinkedList<Country> neighbors;
    private LinkedList<City> cities;
    private LinkedList<Lake> lakes;
    //Métodos//
    public Country(LinkedList<Point> l, City cap, LinkedList<Lake> w) {
        super(l);
        this.capital = cap;
        LinkedList<City> c = new LinkedList<City>();
        c.add(cap);
        this.cities = c; //A country will always contain at least one city (capital)
        this.lakes = w;
    }
    public void addCity(City c) { 
        this.cities.addLast(c);
    }
    public void addNeighbor(Country c) {
        this.neighbors.addLast(c);
    }
    public void draw(java.awt.Graphics g) {
        super.draw(g);
        int lakesize = this.lakes.size(); //draw lakes
        for (int i = 0; i < lakesize ; i++) {
            this.lakes.get(i).draw(g);
        }
        int size = this.cities.size(); //draw cities
        for (int i = 0; i < size; i++) {
            this.cities.get(i).draw(g);
        }
    }   
}
