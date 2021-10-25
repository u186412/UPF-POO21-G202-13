package distancematrix;

public class GeometricPoint {
    //Atributes//
    private double X; 
    private double Y;
    private String name;
    //Methods//

    //Constructor//
    public GeometricPoint(double x, double y, String name) {
        this.X = x;
        this.Y = y;
        this.name = name;
    }

    //Getter//
    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public String getName() {
        return name;
    }

    //Setter//
    public void setX(double x) {
        this.X = x;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setY(double y) {
        this.Y = y;
    }

    //Distance//
    public double DistancePoint(GeometricPoint P){
        double distance = Math.sqrt((P.X - this.X) * (P.X - this.X) + (P.Y - this.Y) * (P.Y - this.Y));//Formula para calcular la distancia//
        return distance;
    }

    //Print//
    public void Printpoint(){
        System.out.println("("+ X +","+ Y + "," + name + ")");//Printea el punto//
    }

    
}