package com.kodnest.pattern6;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("User! Please enter row value: ");
		int m = sc.nextInt();
		System.out.println("User! Please enter column value: ");
		int n = sc.nextInt();
		
		// Upper part of the pattern
        for (int i=0; i<m; i++) {
            // Print leading spaces
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j=0; j<n-2*i; j++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
		
		sc.close();
	}
}