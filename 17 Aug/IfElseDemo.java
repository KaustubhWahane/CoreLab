 /*
 Program - Nested If 
 Name - Kaustubh Wahane
 Date - 17 Aug 2022
 */
	class IfElseDemo {
		static void takeAdmission ()
		{
			float totalMarks = 78.f;
			float pcmMarks = 88.9f;
			if(totalMarks > 75)
			{
				if (pcmMarks > 85)
				{
					System.out.println("You are eligible for BSC");
				} else 
				{
					System.out.println("You are eligible for BCA");
				}
			}else 
			{
				System.out.println("You are eligible for our college");
			}
			System.out.println("-----Thank You ----");
		}
		public static void main (String args[])
		{
			takeAdmission();
			
		}
	}