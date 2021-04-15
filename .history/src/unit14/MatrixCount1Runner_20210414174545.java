package unit14;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		MatrixCount1 mc1 = new MatrixCount1();
		int[][] m = {{ 1, 2, 3, 4, 5},
		{ 6, 7, 8, 9, 0},
		{ 6, 7, 1, 2, 5},
		{ 6, 7, 8, 9, 0},
		{ 5, 4, 3, 2, 1}};

		System.out.println("Matrix values");
        for (int i = 0; i < m.length; i++)
        {
            for (int j = 0; (m[i] != null && j < m[i].length); j++) {
                System.out.print(m[i][j] + " ");
            }
 
            System.out.println();
        }

		System.out.println();
		System.out.println("The 7 count is :: " + mc1.count(7));
		System.out.println("The 8 count is :: " + mc1.count(8));
		System.out.println("The 6 count is :: " + mc1.count(6));
		System.out.println("The 21 count is :: " + mc1.count(21));
	}
}



