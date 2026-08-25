package myfirstjavaproject;

public class DigitalWatch {
	
	String brandName;
	String watchType;
	int hours;
	int min;
	int sec;
	int price;
	
	void displayTime() {
		System.out.println("Hr:Min:Sec " + hours+":" + min+":"+ sec);
		System.out.println("----------------------------------");
	}
	
	void displayWatchDetails() {
		System.out.println("****  WatchDetails  *****");
		System.out.println("----------------------------------");
		System.out.println("Brand: " + brandName);
		System.out.println("watchType: " + watchType);
	}
	
	void updateHour() {
		
		hours ++;
		min ++;
        sec ++; 
        System.out.println("                               ");
		System.out.println("Updatetime");
		System.out.println("Hr:Min:Sec " + hours+":" + min+":"+ sec);
		
		
	}
	
	
	public static void main(String[] args) {
		
		DigitalWatch t = new DigitalWatch();
		
		t.brandName = "Forest";
		t.watchType = "Digital";
		t.hours = 10;
		t.min = 45;
		t.sec = 55;
		t.price = 3000;
		t.displayWatchDetails();
		t.displayTime();
		t.updateHour();
		

	}

}
