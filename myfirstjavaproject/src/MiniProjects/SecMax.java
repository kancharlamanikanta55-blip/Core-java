package MiniProjects;

public class SecMax {

	public static void main(String[] args) {
		System.out.println("Main method");
           int arr[] = {5,10,3,24,45,55};
           int Max = Integer.MIN_VALUE;
           int secound_Max = Integer.MIN_VALUE;
           
           for(int i =0; i< arr.length; i++) {
        	   if(arr[i] > Max) {
        		  secound_Max= Max;
        		  Max = arr[i];
        	   }
           }
           System.out.println("The first max num: " + Max);
           System.out.println("The sec_max num: "+ secound_Max);
	}

}
