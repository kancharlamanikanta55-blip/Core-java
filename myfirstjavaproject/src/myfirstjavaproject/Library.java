package myfirstjavaproject;

public class Library {
	
	 static String labraryName;
	 static String librarianName;
	 
	 int bookId;
	 String booktitle;
	 String authorName;
	 int availbleCopies;
	 
	 void display() {
		 System.out.println("BookNo: " + bookId);
		 System.out.println("Booktitle: " + booktitle);
		 System.out.println("AuthorName: " + authorName);
		 System.out.println("AvailbleCopies: " + availbleCopies);
		 
	 }
	 
	 void issueBook() {
		 availbleCopies = availbleCopies - 1;
		 System.out.println("AvailbleCopies: " + availbleCopies);
	 }
	 
	 
	 static void displayDetails() {
		System.out.println("LabraryName: " + labraryName); 
		System.out.println("LibrarianName: " + librarianName); 
	 }
	 
	 static void changeLibrian() {
		 System.out.println("LibrarianName: " + librarianName); 
	 }
	 
	 

	public static void main(String[] args) {
	

		Library lib = new Library();
		
		
		labraryName = "World Wide";
		librarianName = "Srinu";
		
		lib.bookId = 126654;
		lib.booktitle = "Plant os the apes";
		lib.authorName = "Jon";
		lib.availbleCopies = 10;
		lib.display();
		lib.issueBook();
		displayDetails();
	
		
System.out.println("**********************************");


		Library  l2 = new Library();
		
		
		
		librarianName = "Ram";
		
		l2.bookId = 4526654;
		l2.booktitle = "Plant ";
		l2.authorName = "Jon son";
		l2.availbleCopies = 500;
		l2.display();
		l2.issueBook();
		displayDetails();
		
	
		
	}

}
