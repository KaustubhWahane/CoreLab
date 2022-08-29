/*
Name - Kaustubh Wahane
Date - 17 Aug 2022
Program- To calculate the electricity bill for customers depending upon there price
*/ 

//Making a class
class Example
{
	static void Rupee(int noOfUnits)
	{
		double billAmount = 0.0f;
		if(noOfUnits <=  50)
		{
			billAmount= noOfUnits*0.50;
		}
			else if (noOfUnits <= 150)
			{
				billAmount = 25+ ((noOfUnits-50) * 0.75); // we have added 25 here because the first 50 units amount is 25
			}
				else if (noOfUnits <= 250)
				{
					billAmount = 100 + ((noOfUnits-150)* 1.20);
				}
		else
		{
			billAmount = 220 + ((noOfUnits - 250) *1.50);
		}
		billAmount  = billAmount + (0.20* billAmount);
		System.out.println("The amount is :" + billAmount);
	}
	public static void main (String args[])
	{
		int units = Integer.parseInt(args[0]);
		Rupee(units);
	}
}