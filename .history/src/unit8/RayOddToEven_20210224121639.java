package unit8;

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{

		int oddIndex = 0;
		int evenIndex = 0;
		int result = 0;

		for(int i = 0; i < ray.length; i++) {
			if(ray[i]%2 != 0 ) {
				oddIndex = i;
			} else {
				result = -1;
			}
		}

		for (int j = oddIndex; j < ray.length; j++) {
			if(ray[j]%2 == 0) {
				evenIndex = j;
			} else {
				result = -1;
			}
		}

		if(result != -1) {
			result = evenIndex - oddIndex;
		}

		return result;


	}
}