/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - MultiDimArray
*/
//declaring a class
class MultiDimArray
{
	static void printValue() 
	{
		int myArray[][] = {{1,2,3}, {4,5,6},{7,8,9}}; //The two brackets represents one row and one column
		for (int i = 0;i < 3; i++) //This is for row loop
		{
			for (int j = 0; j < 3; j++) //This is for column loop
			{
				System.out.print(myArray[i][j]);
				
			}
			  System.out.println(); //It will make the rest of the numbers to there respective rows
		}
	}
	public static void main (String args[])
	{
		printValue();
	}
}