package distancematrix;

public class TestPoint {
    public static void main(String[] args){
        GeometricPoint Madrid = new GeometricPoint(4, 6, "Madrid");
        GeometricPoint Barcelona = new GeometricPoint(2, -12, "Barcelona");
        Barcelona.Printpoint();
        Madrid.Printpoint();
        Barcelona.setX(8);
        Madrid.setY(9);
        System.out.println(Barcelona.getX());
        System.out.println(Madrid.getY());
        System.out.println(Barcelona.DistancePoint(Madrid));
        Madrid.setName("Almeria");
        Madrid.Printpoint();
    }
}