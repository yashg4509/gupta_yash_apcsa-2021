//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator, denominator;

	public Rational (int numer, int denom)
	{
	   if (denom == 0)
		  denom = 1;
	
	   // Make the numerator "store" the sign
	   if (denom < 0)
	   {
		  numer = numer * -1;
		  denom = denom * -1;
	   }
	
	   numerator = numer;
	   denominator = denom;
	
	   reduce();
	}

	//write a setRational method
	

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}




public int getNumerator ()
{
   return numerator;
}

public int getDenominator ()
{
   return denominator;
}

public Rational reciprocal ()
{
   return new Rational (denominator, numerator);
}

public Rational add (Rational op2)
{
   int commonDenominator = denominator * op2.getDenominator();
   int numerator1 = numerator * op2.getDenominator();
   int numerator2 = op2.getNumerator() * denominator;
   int sum = numerator1 + numerator2;

   return new Rational (sum, commonDenominator);
}

public Rational subtract (Rational op2)
{
   int commonDenominator = denominator * op2.getDenominator();
   int numerator1 = numerator * op2.getDenominator();
   int numerator2 = op2.getNumerator() * denominator;
   int difference = numerator1 - numerator2;

   return new Rational (difference, commonDenominator);
}

public Rational multiply (Rational op2)
{
   int numer = numerator * op2.getNumerator();
   int denom = denominator * op2.getDenominator();

   return new Rational (numer, denom);
}

public Rational divide (Rational op2)
{
   return multiply (op2.reciprocal());
}

public boolean equals (Rational op2)
{
   return ( numerator == op2.getNumerator() &&
			denominator == op2.getDenominator() );
}

public String toString ()
{
   String result;

   if (numerator == 0)
	  result = "0";
   else
	  if (denominator == 1)
		 result = numerator + "";
	  else
		 result = numerator + "/" + denominator;

   return result;
}

//implements comparable interface
public int compareTo(Object test)
{
   Rational num= (Rational)test;

   double thisValue = (double)numerator / denominator;
   double otherValue = (double)num.numerator / num.denominator;

   if (Math.abs(thisValue - otherValue) < TOLERANCE)
	  return 0;
   else
	  if (thisValue > otherValue)
		 return 1;
	  else
		 return -1;
}


//  Reduces this rational number by dividing both the numerator

private void reduce ()
{
   if (numerator != 0)
   {
	  int common = gcd (Math.abs(numerator), denominator);

	  numerator = numerator / common;
	  denominator = denominator / common;
   }
}


//  Computes and returns the greatest common divisor of the two
//  positive parameters. Uses Euclid's algorithm.

private int gcd (int num1, int num2)
{
   while (num1 != num2)
	  if (num1 > num2)
		 num1 = num1 - num2;
	  else
		 num2 = num2 - num1;

   return num1;
}