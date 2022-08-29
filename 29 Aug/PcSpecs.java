/*
Name - Kaustubh Wahane
Date - 29 Aug 2022
Program - Pc specs description
*/

//declaring a class
//Using Import method
import static java.lang.System.*;
 class Pc
 {
	//Assing Pc properties to there successfully variable
	 	String Pc_processor ;
	 	int cores;
		String Gpu;
		String Motherboard;
		
	 //Method to print Pc properties
	 void pcDetails()
	 {
		 out.println("Your Pc_processor is: " + Pc_processor);
		 out.println("Your core name is : " + cores);
		 out.println("Your Gpu is : " + Gpu);
		 out.println("Your motherboard is : " + Motherboard);
	 }
	//Now calling the main method
	
	 public static void main (String ... args)
	 {
		 //Now creating all the data of car
		 Pc p1= new Pc();
		 //This is where we put the values to the variables we assigned 
		 p1.Pc_processor = "Ryzen-5 1600";
		 p1.cores = 12;
		 p1.Gpu = "GTX 1069"; 
		 p1.Motherboard= "B450-DS3H Gigabyte";
		
		 //This line of code uses to print the details taken from carDetails to the main method
		 p1.pcDetails();
	 }

	
	
 }