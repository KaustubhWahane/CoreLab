/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - MultiDimArray
*/
//declaring a class
class MultiDimArray
{
	static void printPattern()
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.println("*" + "  ");
			}
			System.out.println();
		}
	}
	public static void main (String args[])
	{
		printPattern();
	}
	
	
	
}