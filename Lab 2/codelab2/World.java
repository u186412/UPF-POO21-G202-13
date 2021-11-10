import java.util.LinkedList;

public class World {
    //Attribute//
    private LinkedList<Continent> conts;

    //Methods//
    //Constructor//
    public World(LinkedList<Continent> c){
        this.conts = c;
    }
    public void draw(java.awt.Graphics g){
        for(int i = 0; i < this.conts.size(); i++){
            this.conts.get(i).draw(g);
        }
    }

    
}
