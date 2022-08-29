/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - MultiDimArray
*/
//declaring a class
class VarargsDemo
{
	static void printArrayValues(int array[])
	{
		System.out.println();
		System.out.println("Printing array elements: ");
		for (int i :array)
		{
			System.out.println(i + "  ");
		}
	}
	static void betterPrint(int ... x) // ellipse operator
	{
		System.out.println();
		System.out.println("Printing the array elements: ");
		for (int i:x)
		{
		 System.out.println(i + "  ");
		}
		
		
	}
	static void betterPrint(String ... x) // ellipse operator
	{
		System.out.println("String x");
		System.out.println("Printing the array elements: ");
		for (int i:x)
		{
		 System.out.println(i + "  ");
		}
		
		
	}
	public static void main (String args[])
	{
		int r1[] = {};
		int r2[] = {3, 4};
		int r3[] = {45,34,90,35};
		
		// printArrayValues(r1);
		// printArrayValues(r2);		
		// printArrayValues(r3); //If we use this trick without ellipse operator then it will give an error as we cannot pass values of array into int
		
		betterPrint(r1);
		betterPrint(r2);
		betterPrint(r3);
		betterPrint(5,6,7,9);
		betterPrint(); //Its gonna give empty array
		betterPrint("Yokoso","Watashiwa Soul Society"); 
		
	}
}