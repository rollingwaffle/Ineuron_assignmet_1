package com.assignment.ineuron;
import java.security.PublicKey;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

class Answer_1{
	public static void main(String[] args) {
		int n = 8;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n-1 || j == (n-1)/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}			
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j|| j == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (i == (n-1)/2|| i == 0|| i == n-1 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (i == n-1|| j == n-1 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0|| i == (n-1)/2 ||j+2 == i|| j == n-1 && i<n/2) {
					System.out.print("*");
				}
				
				
				else {
					System.out.print(" ");
				}		
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == 0|| i == (n-1) || j == n-1 ) {
					System.out.print("*");
				}
				
				
				else {
					System.out.print(" ");
				}		
			}
			System.out.print("   ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j|| j == n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
			
			

	}
	
}

