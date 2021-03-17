package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	private int numerator, denominator;

	public Rational(int numer, int denom) {
		if (denom == 0)
			denom = 1;

		// Make the numerator "store" the sign
		if (denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	// write a setRational method

	public void setNumerator(int num) {
		numerator = num;
	}

	public void setDenominator(int dem) {
		denominator = dem;
	}

	public void add(Rational other) {
		// num1/den1 + num2/den2
		// new numerator = (num1 * den2 + num2 * den1)
		// new denominator = (den1 * den2)

		reduce();
	}

	private void reduce() {

		if (numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}

	}

	private int gcd(int num1, int num2) {

		while (num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;

		return num1;
	}

	public Object clone() {
		return "";
	}

	// ACCESSORS

	// write get methods for numerator and denominator

	public boolean equals(Object obj) {

		return false;
	}

	public int compareTo(Rational other) {

		return -1;
	}

	// write toString() method

}