package libraryManagement;
import java.util.*;


class book
{
	private int bookId;
	private String bookTitle;
	private int yearOfPublication;
	private String authorName;
	private String publisherName;
	private int numberOfAvailableCopies;
	private int totalCopies;
	private int copies;
	
	
	book()
	{
		totalCopies = 0;
	}
	
	book(int totalCopies)
	{
		totalCopies = copies;
	}
	
	public void setDetails()
	{
		bookId = 0;
		bookTitle = "NULL";
		authorName = "NULL";
		publisherName = "NULL";
		numberOfAvailableCopies = 0;
		totalCopies = copies;
	}
	
	public void setDetails(int id,String title,int year,String author,String publisher,int count)
	{
		bookId = id;
		bookTitle = title;
		authorName = author;
		publisherName = publisher;
		numberOfAvailableCopies = count;
		totalCopies = copies;
		yearOfPublication = year;
	}
	
	public void getDetails(int id)
	{
		System.out.println("a) The book id: " +bookId);
		System.out.println("b) The book title: " +bookTitle);
		System.out.println("c) The author name: " +authorName);
		System.out.println("d) The publisher name: " +publisherName);
		System.out.println("e) The year of publication: "+ yearOfPublication);
		System.out.println("f) The number of available copies: " +numberOfAvailableCopies);
		System.out.println("g) The total number of copies: " +totalCopies);
	}
	
	
	public  void issue(int id)
	{
		
		numberOfAvailableCopies-- ;
		System.out.println("Book issued!!");
		System.out.println("The number of available copies are "+numberOfAvailableCopies);
	}
	
	public  void Return(int id)
	{
		
		numberOfAvailableCopies++ ;
		System.out.println("The number of available copies are "+numberOfAvailableCopies);
	}
	
}


public class LibraryManagementSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	
	book Book[]= new book[50];
	Book[0]= new book(100);
	Book[0].setDetails(0 ,"HS VERMA", 2004, "HARI SHARMA" , "BIRU SHARMA", 30 );
	
	Book[1]= new book(100);
	Book[1].setDetails(1 ,"RD SHARMA", 2000, "RAVI  SHARMA" , "PRIYA SHARMA", 40);
	
	Book[2]= new book(100);
	Book[2].setDetails(2 ,"PHYSICS", 2003, " ALBERT EINSTIEN" , "HEENA", 50);
	
	Book[3] =new book(100);
	Book[3].setDetails(3 ,"MATHS", 2002, "ANURADHA SHARMA" , " AARUSHI SINGH", 60);
	
	Book[4] = new book(100);
	Book[4].setDetails(4 ,"CHEMISTRY", 2001, " SUNIDHI SHARMA" , "KOMAL", 70);
	
	 int bookId;
	 String bookTitle;
	 int  yearOfPublication;
	 String authorName;
	 String publisherName;
	 int numberofAvailableCopies;
	 int totalCopies;
	 int totalCopiess;
	 
	 int total = 5;
	 while(true)
	 {
		 System.out.println("----------------------------------------------------");
		 System.out.println("              WELCOME TO LIBRARY");
		 System.out.println("----------------------------------------------------");
		 System.out.println("Choose from the following action what you want to perform: ");
		 System.out.println("1. Set Details");
		 System.out.println("2. Get Details");
		 System.out.println("3. Issue");
		 System.out.println("4. Return");
		 System.out.println("5. Exit");
		 
		 System.out.println("Enter the number:");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:

				System.out.println("a) Enter the Book Id:");
				bookId= sc.nextInt();
				sc.nextLine();
				System.out.println("b) Enter the Book Title:");
				bookTitle= sc.nextLine();
				
				System.out.println("c) Enter the year of publication:");
				yearOfPublication= sc.nextInt();
				sc.nextLine();
				System.out.println("d) Enter the author name:");
				authorName= sc.nextLine();
				
				System.out.println("e) Enter the publisher name:");
				publisherName= sc.nextLine();
				
				System.out.println("f) Enter the  number of available copies:");
				numberofAvailableCopies  = sc.nextInt();
				sc.nextLine();
				
				Book[total]= new book(100);
				Book[total].setDetails(bookId, bookTitle,  yearOfPublication,  authorName,  publisherName,numberofAvailableCopies  );
				total++;
				break;
				
		 case 2:
			 System.out.println("- Enter the book id:");
			 bookId = sc.nextInt();
			 
			 Book[bookId].getDetails(bookId);
			 break;
			 
		 case 3: 
			 System.out.println("- Enter the book id:");
			 bookId = sc.nextInt();
			 
			 Book[bookId].issue(bookId);
			 break;
			 
		 case 4:
			 System.out.println("- Enter the book id:");
			 bookId = sc.nextInt();
			 
			 Book[bookId].Return(bookId);
			 break;
			 
		 case 5:
			 break;
			 
			 default:
				 System.out.println("Invalid");
		 }
		 
		 
	 }
}
}
