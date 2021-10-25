package distancematrix;
public class TestDisplayMatrix {
    public static void main(String[] args){
    DistanceMatrix matrix = new DistanceMatrix();
    DisplayMatrix display = new DisplayMatrix(matrix);
    display.setVisible(true);
    }
}
