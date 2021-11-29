
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel implements MouseListener{
	protected LinkedList< Entity > drawables;
	protected LinkedList<Entity> selection;

	public DrawPanel() {
		drawables = new LinkedList< Entity >();
		selection = new LinkedList<Entity>();
		addMouseListener( this );
	}

	public void addDrawable( Entity entity ) {
		drawables.add( entity );
	}

	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).draw( g );
	}

	public void translate( int dx, int dy ) {
		Vector v = new Vector(dx, dy);
		for ( int i = 0; i < selection.size(); ++i )
			selection.get( i ).move( v );
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		Point mouse = new Point(e.getX(), e.getY());
		int size = this.drawables.size();
		for (int i = 0; i < (size); i++) {
			if (this.drawables.get(i).isPointInside(mouse) == true) {
				this.selection.addLast(this.drawables.get(i));
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

