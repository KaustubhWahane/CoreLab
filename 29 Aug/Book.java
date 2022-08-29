/*
Name - Kaustubh Wahane
Date - 29 Aug 2022
Program - Book database
*/

//declaring a class

import static java.lang.System.*;
class Book
{
	//instance variable properties
	int pages;
	String book_author;
	int book_id;
	double price;
	
	//method to print Book details
	void printBookDetails()
	{
		out.println("Your name " + book_author);
		out.println("No of pages " + pages);
		out.println("Your book id is " + book_id);
		out.println("The price of the book is " + price);
	}
	//calling main method
	public static void main (String args[])
	{
		Book b1 = new Book();
		b1.book_author = "William Shakespeare";
		b1.pages = 520;
		b1.book_id = 13;
		b1.price = 250;
		
		//calling printBookDetails
		{
			b1.printBookDetails();
		}
		
	}
	
	
	
	
	
	
	
	
}