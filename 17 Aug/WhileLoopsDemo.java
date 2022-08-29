 /*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program - Nested for loops Demo
*/ 

class WhileLoopsDemo 
{
	static void charging (int batteryLife)
	{
		if (batteryLife == 100)
		{
			System.out.println(".... Your Phone is Completely Charged!!...");
		}
		while (batteryLife != 100)
		{
			System.out.println("Charging....");
			batteryLife += 15;
			if (batteryLife > 100)
				break;
		}
	}
	public static void main (String args[])
	{
		int phonestatus = Integer.parseInt(args[0]);
		charging(phonestatus);
	}
}