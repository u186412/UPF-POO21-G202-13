package distancematrix;
public class TestDistanceMatrix {
    public static void main(String[] args){
        DistanceMatrix matrix = new DistanceMatrix();
        matrix.addCity(4, 6, "Madrid");
        matrix.addCity(2, -12, "Barcelona");
        System.out.println(matrix.getCityName(1));
        System.out.println(matrix.getNoOfCities());
        System.out.println(matrix.getDistance(1, 2));
        matrix.createDistanceMatrix();
    }
}
