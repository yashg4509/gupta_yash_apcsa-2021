package unit14;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
    public static void main( String args[] ) throws IOException
    {

                       Grid g = new Grid(10, 10, vals);

                       String str = g.findMax(vals);


                System.out.print(g.toString());
                       System.out.println("\n\n " + str + g);


    }
}
