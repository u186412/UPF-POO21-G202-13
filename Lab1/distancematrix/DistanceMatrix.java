package distancematrix;
import java.util.LinkedList;



public class DistanceMatrix implements Matrix {
    //Atributos//
    private LinkedList<GeometricPoint> list;
    private double matrix[][];
    //Métodos//
    public DistanceMatrix() {
        this.list = new LinkedList<GeometricPoint>();
    }
    public void addCity(double x, double y, String name) {
        GeometricPoint city = new GeometricPoint(x, y, name);
        list.add(city);
    }
    public String getCityName(int index) {
        GeometricPoint city = list.get(index);
        return city.getName();
    }
    public int getNoOfCities() {
        int size = list.size();
        return size;
    }
   public void createDistanceMatrix() {
       this.matrix = new double[getNoOfCities()][getNoOfCities()];
       for(int i = 1; i < getNoOfCities(); i++) {
            for(int j = 1; j < getNoOfCities(); j++) {
                this.matrix[i][j] = this.getDistance(i, j);
            }
       }
    }
    public double getDistance(int index1, int index2) {
        GeometricPoint city1 = list.get(index1);
        GeometricPoint city2 = list.get(index2);
        double distance = city1.DistancePoint(city2);
        return distance;
    }
}