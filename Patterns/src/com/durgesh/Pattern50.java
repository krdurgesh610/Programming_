package com.durgesh;

public class Pattern50 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			if (i >= 2) {
				for (int j = 2; j <= i; j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}
}
