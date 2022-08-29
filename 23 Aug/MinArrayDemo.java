   /*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - To find the minimum number in a array list (MinArrayDemo)
*/ 
class MinArrayDemo
{
	static void minNumber() // We can also write int instead of void (also with return value)
	{
		int array[]  = {5, 69, 2, 32, 12};
		int mNum = array[0]; //This is a new variable where we will store the minimum number
		//Now using the traversing method	
		for (int i = 1; i < array.length; i++)
		{
			if(mNum>array[i]) //checking the number
				mNum = array[i]; //Assigning a lesser variable
		}
		System.out.println("The Minimum Number in the array list is " + mNum);
		
		
	}
	//calling main method
	public static void main (String args[])
	{
		minNumber();
	}
}