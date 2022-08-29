  /*
Name - Kaustubh Wahane
Date - 18 Aug 2022
Program - Example Demo
*/ 
class Example
{
	static void Rupee(int amount)
	{
		int note50 = 0,note20 = 0, note10 = 0, note5 = 0 , note2 = 0, note1 = 0; //assuming every note is 0
		while(amount > 0)
		{
			if (amount > 50) //Putting every value of number so we can reduce it to the desired value
			{
				note50++;
				amount -=50;
			} 
			else if (amount > 20)
				{
					note20++;
					amount -=20;
				}	
					else if (amount > 10)
						{
							note10++;
							amount -=10;
						}	
							else if (amount > 5)
							{
								note5++;
								amount -= 5;
						
							}				else if (amount > 2)
											{
												note20++;
												amount -= 2;
											} 
												else if (amount > 1)
												{
													note1++;
													amount -= 1;
												}
													else
													{
														System.out.println("You have putted a wrong number");
													}				
	} 	}
		public static void main (String args[])//calling main method
		{
			int total = Integer.parseInt(String args[0]);
			Rupee(total);
		}												
	
}