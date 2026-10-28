
public class KohliCls {

	public static void main(String[] args) {
		String name = "KOHLI";
		//int count = 0;
		
		char m = 'a';
		for (char i = 0; i < 5; i++) {
			for (char j = 0; j < name.length(); j++) {
				if (i == j || i + j == 4) {
					System.out.print(name.charAt(i ) + " ");
				} else {
					
					System.out.print(m++ + " ");
					
					
				//	System.out.print( (char)('a' + count));
					//count++;
				}

			}
			System.out.println();
		}
	}

}
