package unit3;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}

	public Distance(int x1, int y1, int x2, int y2) {
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));
	}

	public double getDistance() {
		return distance;
	}

	public void print() {
		System.out.print("distance == ");
		System.out.printf("%.3f", distance);
		System.out.print("\n\n");
	}
}