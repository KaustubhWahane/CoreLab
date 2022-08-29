/*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - MultiDimArray
*/
//declaring a class
import java.util.*; //Importing the java Scanner  
class SwapArray   //Creating the class
{  
    static void ArraySwap()   
    {   
        System.out.println("Enter the value of x and y");  
        Scanner sc = new Scanner(System.in);  
        int x = sc.nextInt();  //Defining  variables
        int y = sc.nextInt();  
        System.out.println("before swapping numbers: "+ x +" "+ y);  
       
		//Swapping the variables
		
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+ x + " " + y);   
    } 
	public static void main (String args[])
	{
		ArraySwap();
	}
}