package unit6;

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover dag = new LetterRemover();
		dag.setRemover("I am Sam I am a", 's');
		System.out.println(dag.toString());											
	}
}