package unit4;

public class AddSubMult
{
	public static double check( double a, double b )
	{
        double result = 0;

		if(a > b) {
            result = a-b;
        } else if (b > a) {
            result = b-a;
        } else if (b == a) {
            result = a*b;
        }

        return result;
	}
}
