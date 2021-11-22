import java.util.LinkedList;

public class World {
    //Attribute//
    private LinkedList<Continent> conts;
    private LinkedList<Ocean> oceans;

    //Methods//
    //Constructor//
    public World(LinkedList<Continent> c, LinkedList<Ocean> o){
        this.conts = c;
        this.oceans = o;
    }
    public void draw(java.awt.Graphics g){
        for(int i = 0; i < this.conts.size(); i++){ //draw continents
            this.conts.get(i).draw(g);
        }
        for(int i = 0; i < this.oceans.size(); i++){ //draw oceans
            this.oceans.get(i).draw(g);
        }
    }

    
}
