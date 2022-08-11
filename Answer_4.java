package com.assignment.ineuron;

public class Answer_4 {
		public static void main(String[] args) {
			int n = 14;
			for (int i = 0; i < (n/2)+1; i++) {
				for (int j = 0; j < n; j++) {
					if ( j<=i || j+i >= n-1)  {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
	
				}
				System.out.println();
			}
		}
}
