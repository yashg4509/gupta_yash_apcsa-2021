package unit3;

import java.util.Scanner;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {

	}

	public Distance(int x1, int y1, int x2, int y2) {

	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		x1 = s.nextInt();
		System.out.print("Enter X2:: ");
		x2 = s.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = s.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = s.nextInt();

		xOne = x1;
		xTwo = x2;
		yOne = y1;
		yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt(Math.pow((xTwo - xOne), 2) + Math.pow((yTwo - yOne), 2));

	}

	public double getDistance() {
		return 0.0;
	}

	public void print() {
	}

	// complete print or the toString

	public String toString() {
		return "";
	}
}