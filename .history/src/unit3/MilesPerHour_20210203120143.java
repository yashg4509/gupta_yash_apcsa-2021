package unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {
    private int distance, hours, minutes;
    private double mph;

    public MilesPerHour() {
        setNum(0, 0, 0);
        mph = 0.0;
    }

    public MilesPerHour(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void setNum(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public void calcMPH() {
        hours = minutes / 60;
        mph = distance / hours;
    }

    public void print() {
    }

    // create a print or toString or both

    public String toString() {
        return "";
    }
}
