package com.durgesh;

public class PrintBoundaryElement {
	public static void main(String[] args) {
		int m = 4, n = 4;
		int[][] arr = new int[m][n];
		arr[0] = new int[] { 1, 2, 3, 4 };
		arr[1] = new int[] { 5, 6, 7, 8 };
		arr[2] = new int[] { 9, 10, 11, 12 };
		arr[3] = new int[] { 13, 14, 15, 16 };

		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				if (r == 0 || c == 0 || r == (4 - 1) || c == (4 - 1)) {
					System.out.print(arr[r][c]);
				} else {
					System.out.print(" ");
				}
			}
		}

	}

}
