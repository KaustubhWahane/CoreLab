/*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - Switch Demo
*/ 
  class SwitchDemo // 1 to 7 numbers to each corresponding days
  {
	  static void printDay()
	  {
		  int day = 5;
		  switch (day)
		  {
			    case 1 -> System.out.println("Monday");
						
				case 2 -> System.out.println("Tuesday");
					
				case 3 -> System.out.println("Wednesday");
						
				case 4 -> System.out.println("Thursday");
						
				case 5 -> System.out.println("Friday");
						
				case 6 -> System.out.println("Saturday");
						
				case 7 -> System.out.println("Sunday");
				
				default -> System.out.println("You have entered a wrong input");
										  
					
		  } // switch ends
	  }
	  static void printNoOfDays() // Any months containing there actual days
	  {
		  String month = "January";
			int year = 2024;
			switch (month)
		  {
			  case "January","March","may","july","august","october","december": System.out.println("Number of days in this month number " + month + " have 31 days");
				break;
			  case "april","june","september","november" : System.out.println("Number of days in this month number " + month + " have 30 days");
				break;
			  case "february" :
			  if (((year % 4 == 0) && (year % 100 !=0)) || (year % 400 == 0))
				  System.out.println("Number of days in this month are " + month + " are 29 days");
			  else 
				  System.out.println("Number of days in this month are " + month + " are 28 days");
				break;
			  default : System.out.println ("Wrong input");
		  }
	  }		
		//calling main method
	public static void main(String args[]) 
	{
		printDay();
		//printNoOfDays();
	} 
  }