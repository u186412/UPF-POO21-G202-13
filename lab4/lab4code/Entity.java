
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;
	private double alpha;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}

	abstract public void draw( java.awt.Graphics g );

	public void SetColor(Color c) {
		this.lineColor = c;
	}
	public Color GetColor() {
		return this.lineColor;
	}

	abstract public void move(Vector v);

	abstract public Boolean isSelected(Point p);

	public abstract Boolean isPointInside(Point p); //Para implementar la parte opcional del trabajo necesitamos que esto sea un metodo abstracto de entity, NO de region!
	
}
