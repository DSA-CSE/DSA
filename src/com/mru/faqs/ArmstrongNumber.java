package com.mru.faqs;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Read number dynamically
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int n = s.nextInt();		
		int n1 = n;

		//Read number of digits
		int digits = String.valueOf(n).length(); //153  ...3  1634  ...4
		
		int sum = 0;
		while(n!=0) {
			int last = n%10;
			sum+=Math.pow(last, digits);
			n=n/10;
		}
		
		System.out.println(n1 == sum ? "Armstrong!!!" : "Not Armstrong!!!");
		}

}
