package com.xworkz.programme.boots;

public class ReversePyrmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		// main loop
		for (int i = n; i >= 1; i--) {
			// printing space
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				System.out.print("@");

			}
			System.out.println("");
		}

	}
}
