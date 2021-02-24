package unit8;


public class RaySumLast
{
	public static int go(int[] ray)
	{
		int total = 0;
		int lastVal = ray[ray.length - 1];

		for (int i = 0; i < ray.length; i++) {
			if(ray[i] > lastVal) {
				total += ray[i];
			}
		}

		return total;
	}
}