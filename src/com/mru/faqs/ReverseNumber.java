package com.mru.faqs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		int rev = 0;
		
		while(num!=0) {
			int last = num%10;
			rev = rev*10+last;
			num = num/10;			
		}
		
		System.out.println("Reversed Number: "+rev);
	}

}
