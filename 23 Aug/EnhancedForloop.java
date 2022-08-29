   /*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Enhanced
*/ 
 class EnhancedLoops
 {
	 static void EnhancedLoops()
	 {
		 String colors[] = {"Red", "Yellow", "Green", "Purple","Blue"};
		 for(String s  : colors)
		 {
			 System.out.println(s);
		 }
	 }
	 public static void main (String args[])
	 {
		 EnhancedLoops();	
	 }
 }

//OR

class EnhancedLoops
{
	static void printNames(String colours)
	{
		
		for(String s: colors)
			System.out.println(s);
	}
	public static void main (String args[])
	{
		printNames(new String[colours] {"Red", "Yellow", "Green", "Purple","Blue"});	
	}
}


