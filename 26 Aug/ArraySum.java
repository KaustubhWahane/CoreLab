/*
Name - Kaustubh Wahane
Date - 26 Aug 2022
Program - Sum of arrays
*/

import java.util.*;
//declaring a class
class SumOfArrays
{
    static void sumOfArrays()
   {
	   //First making a user input using scanner
      System.out.println("Enter the required size of the array : ");
      Scanner scanner = new Scanner(System.in);
      int sizeOfArray = scanner.nextInt(); //taking a integer storing input user
      int Array[] = new int [sizeOfArray]; //taking another integer value storing it into an array
      int sumOfNumbers = 0; //This is where we will store the sum of numbers using this variable
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<sizeOfArray; i++) //Now by using for loop
	  {
         Array[i] = scanner.nextInt(); //Here i is the variable stored into the array
         sumOfNumbers = sumOfNumbers + Array[i]; //Now making this variable store the value of Array and adding it
      }
      System.out.println("Elements of the array are: "+ Arrays.toString(Array)); //Notice this i have use it to change the value of string to integer
      System.out.println("Sum of the elements of the array : "+ sumOfNumbers); //The value after adding all the values getting from the user
   }
   public static void main (String args[])
   {
	   sumOfArrays();
   }
}
