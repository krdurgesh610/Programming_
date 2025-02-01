package com.durgesh;

public class Transpose {
	public static void main(String[] args) {
		int m = 4;
		int temp[][] = new int[m][m];
		int[][] arr = new int[m][m];
		arr[0] = new int[] { 1, 2, 3, 4 };
		arr[1] = new int[] { 5, 6, 7, 8 };
		arr[2] = new int[] { 9, 10, 11, 12 };
		arr[3] = new int[] { 13, 14, 15, 16 };

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				temp[i][j] = arr[j][i];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
