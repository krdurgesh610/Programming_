package com.durgesh;

public class Pattern34 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			char ch = (char) ('A' + i);
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
