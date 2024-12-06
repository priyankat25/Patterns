package com.kodnest.pattern3;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("User! Please enter any integer value except zero and negative values: ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<n; j++) {
				if(i+j <= n) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}