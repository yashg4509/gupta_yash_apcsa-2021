package unit5;

public class FirstLastVowel
{
   public static String go( String a )
	{

		char first = a.charAt(0);
		char last = a.charAt(a.length()-1);
		String result = "";

		for(char c: a.toCharArray()) {
			if((first == c) || (last == c)) {
				result = "yes";
			} else {
				result = "no";
			}
		}

		return result;


	}
}