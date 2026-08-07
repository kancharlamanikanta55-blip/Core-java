package myfirstjavaproject;

public class Matrix {

	public static void main(String[] args) {
		int [][] mat = {
				
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		int[][] res = new int[4][4];
		
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				res[i][j] = mat[i][3 - j];
		
		for (int i = 0; i < 4; i++)
			for (int j = 0; j < 4; j++)
				if (i == j || j == 3 || i + j == 3)
				res[i][j] *= res[i][j] ;
		
		for (int[] r : res) {
			System.out.print("[");
			for (int x : r) System.out.print(x + " ");
			System.out.println("]");
		}

	}

}
