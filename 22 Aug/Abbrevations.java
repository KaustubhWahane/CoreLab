/*
Program - To print the full form of Abbrevations via user input
author - Kaustubh Wahane
Date - 22 Aug 2022
*/

//Creating a class
class Abbrevations
{
	//Giving a method name
	static void printAbbrevations(String Abbrevations)
	{
		//Switch case started
		switch (Abbrevations){
			//If the abbrevation is AWQL
		case "AWQL" ->System.out.println("Absent without leave");
		//If the abbrevation is ASAP
		case "ASAP" ->System.out.println("As soon as possible");
		//If the abbrevation is CAL
		case "CAL" -> System.out.println("Calculate");
		//If the abbrevation is GMT
		case "GMT" -> System.out.println("Greenwich mean time");
		//If the abbrevation is IRS
		case "IRS" -> System.out.println("Internal Revenue Service");
		
		default -> System.out.println("Sorry this abbrevation is wrong"); //If the abbrevation input is wrong
		//Switch case ended
		}
	}
	
	//Calling the main method
	public static void main (String args[])
	{
		printAbbrevations(args[0].toUpperCase()); //Any input user will give it will convert to Uppercase
	}
}
		