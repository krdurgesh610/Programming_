package com.durgesh;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (k > 9) {
					k = 1;
				}
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}
