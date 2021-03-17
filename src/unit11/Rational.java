package unit11;
//(c) A+ Computer Science

//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class Rational implements Comparable<Rational> {
	private int numerator, denominator;

	public Rational() {
		numerator = 1;
		denominator = 1;
	}

	public Rational(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	public void setRational(int num, int denom) {
		setNumerator(num);
		setDenominator(denom);
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	public void setDenominator(int dem) {
		denominator = dem;
	}

	public void add(Rational other) {
		this.setNumerator((this.getNumerator() * other.denominator) + (other.numerator * this.getDenominator()));
		this.setDenominator(this.getDenominator() * other.denominator);
		// reduce();
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
		return new Rational(getNumerator(), getDenominator());
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public boolean equals(Rational obj) {

		return (numerator == obj.getNumerator() && denominator == obj.getDenominator());
	}

	public int compareTo(Rational other) {
		// Should create copy constructor
		Rational num1 = new Rational(numerator, denominator);
		Rational num2 = new Rational(other.getNumerator(), other.getDenominator());
		num1.reduce();
		num2.reduce();

		if (num1.getDenominator() < num2.getDenominator()) {
			return -1;
		} else if (num1.getDenominator() == num2.getDenominator()) {
			if (num1.getNumerator() < num2.getNumerator()) {
				return -1;
			} else if (num1.getNumerator() > num2.getNumerator()) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return 1;
		}
	}

	public String toString() {
		return this.numerator + "/" + this.denominator + "\n";
	}
}