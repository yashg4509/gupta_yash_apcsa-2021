package unit14;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		MatrixCount1 m = new MatrixCount1();
		
        for (int i = 0; i < m.m.length; i++)
        {
            for (int j = 0; (m.m[i] != null && j < m.m[i].length); j++) {
                System.out.print(m.m[i][j] + " ");
            }
 
            System.out.println();
        }
	}
}



