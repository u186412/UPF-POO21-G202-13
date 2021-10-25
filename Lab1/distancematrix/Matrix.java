package distancematrix;

public interface Matrix {
	public void addCity( double x, double y, String name );
	public String getCityName( int index );
	public int getNoOfCities();
	public void createDistanceMatrix();
	public double getDistance( int index1, int index2 );
}
