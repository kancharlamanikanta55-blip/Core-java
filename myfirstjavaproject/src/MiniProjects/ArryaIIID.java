package MiniProjects;

public class ArryaIIID {

	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3];
		
		arr[0][0][0] = 05;
		arr[0][0][1] = 10;
		arr[0][0][2] = 20;
		arr[0][1][0] = 110;
		arr[0][1][1] = 120;
		arr[0][1][2] = 130;
		arr[0][2][0] = 140;
		arr[0][2][1] = 220;
		arr[0][2][2] = 320;

		arr[1][0][0] = 05;
		arr[1][0][1] = 10;
		arr[1][0][2] = 20;
		arr[1][1][0] = 110;
		arr[1][1][1] = 120;
		arr[1][1][2] = 130;
		arr[1][2][0] = 140;
		arr[1][2][1] = 220;
		arr[1][2][2] = 320;

		arr[2][0][0] = 05;
		arr[2][0][1] = 10;
		arr[2][0][2] = 20;
		arr[2][1][0] = 110;
		arr[2][1][1] = 120;
		arr[2][1][2] = 130;
		arr[2][2][0] = 140;
		arr[2][2][1] = 220;
		arr[2][2][2] = 320;

		for (int[][] a1 : arr) {
			for (int[] a11 : a1) {
				for (int a : a11) {
					System.out.print(a + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
