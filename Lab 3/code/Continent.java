import java.util.LinkedList;

public class Continent {
    //Attribute//
    private LinkedList<Country> countries;

    //Methods//
    //Constructor//
    public Continent(LinkedList<Country> c){
        this.countries = c;
    }

    //getter//
    public double getTotalArea(){
        double Area = 0;
        for(int i = 0; i < this.countries.size(); i++ ){
            Area += this.countries.get(i).getArea();
        }
        return Area;
    }
    public void draw(java.awt.Graphics g){
        for(int i = 0; i < this.countries.size(); i++){
            this.countries.get(i).draw(g);
        }
    }
    
}