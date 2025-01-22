package com.mru.faqs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("Enter the number of terms in the Fibonacci series: "); int
		 * n = sc.nextInt();
		 * 
		 * int firstTerm = 0, secondTerm = 1;
		 * 
		 * System.out.println("Fibonacci Series up to " + n + " terms:");
		 * 
		 * for (int i = 1; i <= n; ++i) { System.out.print(firstTerm + ", ");
		 * 
		 * // Compute the next term int nextTerm = firstTerm + secondTerm; firstTerm =
		 * secondTerm; secondTerm = nextTerm; }
		 */
		
		System.out.print("Enter number of fib series: ");
		int n = sc.nextInt();
		int[] fib = new  int[n];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<fib.length;i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		//System.out.print(fib[0]+" "+fib[1]+" ");
		for(int element:fib) {
			System.out.print(element+" ");
		}
        
        sc.close();

	}

}
