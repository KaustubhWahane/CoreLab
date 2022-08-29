 /*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - For factorial loops Demo
*/ 
class ForloopsInfiniteDemo
{
	static void  calcFactorial (int num)
	{
		int result = 1;
		int c1; //local variable
		for (c1 = 1 ; c1 <= num; c1++)
		{
			result *= c1;
		}
		System.out.println("The factorial of this number " + num + " is this " +result);
	}
	public static void main (String args[])
	{
		int factNumber = Integer.parseInt (args[0]);
		calcFactorial(factNumber);
	}
}