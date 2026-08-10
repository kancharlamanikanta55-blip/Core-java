package myfirstjavaproject;

import java.math.BigInteger;

public class StudentDetails {
	
      BigInteger studentID = new BigInteger("221572");
      String studentName;
      String gender;
      String branchName;
      String collegeName;
      
      void DisplayStudentDetails() {
    	  System.out.println("StudentID: " + studentID);
    	  System.out.println("StudentName: " + studentName);
    	  System.out.println("Gender: " + gender);
    	  System.out.println("BranchName: " + branchName);
    	  System.out.println("CollegeName: " + collegeName);
    	  
    	  
      }
	public static void main(String[] args) {
		
		StudentDetails s1 = new StudentDetails();
		
		s1.studentID = new BigInteger("221570");
		s1.studentName = "Manikanta";
		s1.gender = "male";
		s1.branchName = "CSE";
		s1.collegeName = "Audisankara";
		
		s1.DisplayStudentDetails();
		
		System.out.println("******************************************");
       StudentDetails s2 = new StudentDetails();
       
     
		s2.studentID = new BigInteger("221573");
		s2.studentName = "Sai";
		s2.gender = "male";
		s2.branchName = "ECE";
		s2.collegeName = "AKVK";
		
		s2.DisplayStudentDetails();
		
	}

}
