package myfirstjavaproject;

public class StudentRecord {
	
	static String collegeName;
	static String principalName;
	
	int rollNo;
	String studentName;
	int marks;
	
	
	void displayStudentDetails() {
		System.out.println("RollNo: " + rollNo);
		System.out.println("studentName: " + studentName);
		System.out.println("marks: " + marks);
		
	}
	
	void checkResult() {
		
		marks = marks % 40;
		System.out.println("TotalMarks: " + marks);
		
	}
	
	
	static void displayCollegeDetails() {
		System.out.println("CollegeName: " + collegeName);
		System.out.println("PrincipalName: " + principalName);
	}
	
	static void changePrincipal() {
		System.out.println("PrincipalName: " + principalName);
		
	}

	public static void main(String[] args) {
		
		
		StudentRecord s1 = new StudentRecord();
		
		
		s1.rollNo = 220572;
		s1.studentName = "Pandu";
		s1.marks = 60;
		
		collegeName = "Audisanakara";
		principalName = "Penchaalayya";
		
		s1.displayStudentDetails();
		s1.checkResult();
		displayCollegeDetails();
		
		System.out.println("***********************************");
		
       StudentRecord s2 = new StudentRecord();
		
		
		s2.rollNo = 220590;
		s2.studentName = "Fruit";
		s2.marks = 100;
		
		collegeName = "Audisanakara College";
		principalName = "Penchaalayya Adhi";
		
		displayCollegeDetails();
		s2.displayStudentDetails();
		s2.checkResult();
		
		
	}

}
