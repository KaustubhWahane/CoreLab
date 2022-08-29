/*
Name - Kaustubh Wahane
Date - 29 Aug 2022
Program - Car database in two ways
*/

//declaring a class

//Using Import method
import static java.lang.System.*;
 class Car
 {
	//Assing car properties to there successfully variable
	 String car_name;
	 String car_plate;
	 double car_price;
	 String car_color;
	
	 //Method to print car properties
	 void carDetails()
	 {
		 out.println("Your car name is: " + car_name);
		 out.println("Your car nameplate is : " + car_plate);
		 out.println("Your car price is : " + car_price);
		 out.println("Your car colour is : " + car_color);
	 }
	//Now calling the main method
	
		 public static void main (String ... args)
		 {
			 //Now creating all the data of car
			 Car c1 = new Car();
			 //This is where we put the values to the variables we assigned 
			 c1.car_name  = "Lambhorgini Aventador LP-700";
			 c1.car_plate = "MH-123469";
			 c1.car_price = 5000000;
			 c1.car_color = "black";
			
			 //This line of code uses to print the details taken from carDetails to the main method
		     c1.carDetails();
		 }
	
	
	
 }


/*Or Now we can make the same Car details printing method same as by making another way
In this way we can add more car details without having to make a another instance method


class Car
{
	//Assing car properties to there successfully variable
	
	//Method to print car properties
	void carDetails(String car_name,String car_plate,double car_price,String car_color)
	{
		out.println("Your car name is: " + car_name);
		out.println("Your car nameplate is : " + car_plate);
		out.println("Your car price is : " + car_price);
		out.println("Your car colour is : " + car_color);
	}
	//Now calling the main method
	
		public static void main (String ... args)
		{
			//Now creating all the data of car
			Car c1 = new Car();
			Car c2 = new Car();
			//This line of code uses to print the details taken from carDetails to the main method
		    c1.carDetails("Koenigsegg Agera","MH-10269",666969,"Black");
		    c1.carDetails("E46 BMW M3 GTR","MH-19519",5107501,"White with Blue Stripes");
			
		}	
}
*/