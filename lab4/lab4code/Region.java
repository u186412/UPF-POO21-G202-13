import java.awt.Color;
abstract public class Region extends Entity {
    protected Color fillColor;
    public Region( Color lcinit ) {
		super(lcinit);
        this.fillColor = lcinit; //si se desea un fillColor diferente al lineColor se ha de indicar manualmente en GraphicalInterface, puesto que si no se inicializa coje el último color usado por el programa
	}
    public abstract  double getArea();
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
    //public abstract Boolean isPointInside(Point p);  declaracion movida a Entity para facilitar el funcionamento del programa
}
