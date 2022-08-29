/*
Name - Kaustubh Wahane
Program - To find the array index via input user
Date - 23 Aug 2022
*/
class ArrayDemo
{
	static void printArray(int num1, int num2)
	{
		int myArray[] = new int [10];
		myArray[0] = num1;
		myArray[1] = num2;
		
		System.out.println("First element:" + myArray[0]);
		System.out.println("First element:" + myArray[1]);
	}
	public static void main (String args[])
	{
		printArray(Integer.parseInt(args[0]),(Integer.parseInt(args[1]));
	}
}