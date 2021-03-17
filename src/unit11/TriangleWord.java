package unit11;

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord {
	// instance variables and constructors could be present, but are not necessary

	public void printTriangle(String word) {

		for (int i = 1; i <= word.length(); i++) {
			for (int x = 0; x < i; x++) {
				System.out.print(word.substring(0, i));
			}
			System.out.println(" ");
		}
	}
}