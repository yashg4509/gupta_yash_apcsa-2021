package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour()
	{
		setNums(0,0,0);
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}
	
	public void calcMPH()
	{
		mph = distance / (minutes/60);
	}

	public void print() {
		System.out.print("mph == ");
		System.out.printf("%.3f", mph);
		System.out.print("\n\n");
	}
}
