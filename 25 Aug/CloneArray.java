/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - MultiDimArray
*/
//declaring a class
class CopyArray 
{
	static void copyArray()
    {
        
        int array1[] = { 1, 2, 69 };
        int array2[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++)
		{
			array2[i] = array1[i];	
			array2[0]++;
		}
 
        // Changing Array2[] to verify that Array2 is different from Array1
        System.out.println("Contents of Array1[] ");
 
        for (int i = 0; i < array1.length; i++)
            System.out.print(array1[i] + " ");
 
        
        System.out.println("\nContents of Array2[] ");
 
        for (int i = 0; i < array2.length; i++)
            System.out.print(array2[i] + " ");
    }
	public static void main (String args[])
	{
		copyArray();
	}
}