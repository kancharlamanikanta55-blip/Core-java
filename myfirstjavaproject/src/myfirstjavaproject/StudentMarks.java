package myfirstjavaproject;

public class StudentMarks {

	
	  static String collegeName = "Audisankara";
	  
	  int studentid;
	  String studentName;
	  int englishMarkes;
	  int teluguMarkes;
	  int hindiMarkes;
	 
	  double percentage;
	  int totalMarks;
	  
	  void calculateTotal() {
		
		  totalMarks = englishMarkes + teluguMarkes + hindiMarkes;
		  
		  System.out.println("TotalMarks: " + totalMarks);
		  
	  }
	  
	  void calculatepercentage() {
		 percentage = (totalMarks % 100 );
		 
		 System.out.println("Percentage: " + percentage);
		  
	  }
	  
	  void display() {
		  
		  System.out.println("Student ID: " + studentid);
			System.out.println("Student Name: " + studentName);
		  System.out.println("CollegeName: " + collegeName);
	  }
	  
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentMarks s1 = new StudentMarks();
		
		System.out.println("***********Student INFO 1*****************");
		
		
		s1.studentid = 12345;
		s1.studentName = "manik";
		s1.englishMarkes = 50;
		s1.teluguMarkes = 60;
		s1.hindiMarkes = 80;
		
		
		s1.display();
		s1.calculateTotal();
		s1.calculatepercentage();
		
		
		StudentMarks s2 = new StudentMarks();

		System.out.println("***********Student INFO 2*****************");
		
		
		s2.studentid = 58493;
		s2.studentName = "sai";
		s2.englishMarkes = 80;
		s2.teluguMarkes = 30;
		s2.hindiMarkes = 60;
	
		
		
		s2.display();
		s2.calculateTotal();
		s2.calculatepercentage();
		
		
	}

}
