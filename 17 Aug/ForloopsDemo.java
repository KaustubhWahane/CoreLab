 /*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - For loops Demo basic
*/ 

	class ForloopsDemo 
	{
		static void printNumbers()
		{
			System.out.println ("Printing  1 to 10 numbers");
			for (int a = 0; a <= 10; a ++)
			{
				System.out.println (a);
			}				
		}
	
	public static void main (String args[]) 
	{
		printNumbers();
	}
	}
	
	//OR//
	
	class ForloopsDemo2 
	{
		static void printNumbers()
		{
			int b = 0;
			System.out.println ("Printing  1 to 10 numbers");
			for (; b <= 10; )
			{
				System.out.println (b);
				b++;
			}				
		}
	
	public static void main (String args[]) 
	{
		printNumbers();
	}
	}