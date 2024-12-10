package com.kodnest.pattern5;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("User! Please enter any integer value except zero and negative values: ");
		int n = sc.nextInt();
		
		// Outer loop for number of rows
        for (int i=1; i<=n; i++) {
            // Loop for spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            
            // Loop for stars
            for (int k=1; k<=(2*i-1); k++) {
                System.out.print("* ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
		
		sc.close();
	}
}