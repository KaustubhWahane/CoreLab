/*
Name - Kaustubh Wahane
Program - To find the array index via input user
Date - 23 Aug 2022
*/

class FindArray
{
	static void toFindArray(int searchNum)
	{
	int array[] = {1,2,3,4,5,6,7};
		boolean flag = false;
		//traversing the array
		for (int i = 0; i<array.length;i++)
		{
			if (searchNum == array[i])
			{
				flag = true;
				break;
			}
		}
		//There is another for loops method which is called enhanced for loops
		/*
		for (int i :array)
		{
			System.out.println(i);
		}
		if (flag == true)
			System.out.println ("The number " + searchNum "is present in the list");
		else 
			System.out.println("The number " + searchNum " is not present in the list");
		*/
		if (flag == true)
		{
			System.out.println("The Number" + searchNum + " is in the array list ");
			
		}else 
		{
			System.out.println("The Number" + searchNum + " is not present in the array list");
		}			
	}
	public static void main (String args[])
	{
		toFindArray(Integer.parseInt(args[0]));
	}
}