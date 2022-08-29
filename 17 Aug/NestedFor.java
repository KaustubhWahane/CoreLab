 /*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - Nested for loops Demo
*/ 
class NestedFor
{
	static void printPattern()
	{
		for (int i = 1; i <=5; i++)
		{ System.out.println();
			for (int j = 1; j <= i; j++) // i and j are the two for loops
				System.out.println("*");	
		}
	}
	public static void main (String args[])
	{
		printPattern();
	}
}