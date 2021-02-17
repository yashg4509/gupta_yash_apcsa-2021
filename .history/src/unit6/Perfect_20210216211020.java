package unit6;

import static java.lang.System.*;

public class Perfect {
	private int number, totalValue, previousNums;

	// add constructors

	public Perfect() {
		totalValue = 0;
		previousNums = 0;
		setNum(0);
	}

	public Perfect(int x) {
		totalValue = 0;
		previousNums = 0;
		setNum(x);
	}

	// add a set method

	public void setNum(int i) {
		number = i;
	}

	public boolean isPerfect() {
		totalValue = 0;
		previousNums = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				previousNums += i;
			}
		}

		totalValue = previousNums;

		if (totalValue == number) {
			return true;
		} else {
			return false;
		}
	}

	// add a toString

}