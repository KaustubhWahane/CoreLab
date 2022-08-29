/*
Name - Kaustubh Wahane
Date - 29 Aug 2022
Program - Student database
*/

//declaring a class

import static java.lang.System.*;
class Student
{
	//instance variable properties
	int rollno;
	String name;
	int age;
	double marks;
	
	//method to print Student marks details
	void printStudentDetails()
	{
		String course = "Full stack java" ;
		out.println("Your name " + name);
		out.println("Your rollno" + rollno);
		out.println("Your Age" + age);
		out.println("Your marks" + marks);
		
		
	}
	public static void main (String args[])
	{
		Student s1 = new Student ();
		s1.rollno = 69;
		s1.name = "Kaustubh";
		s1.age = 21;
		s1.marks = 100;
		
		//calling printStudentDetails
		s1.printStudentDetails();
	}
	
	
	
	
	
	
	
	
}