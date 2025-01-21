package com.mru.faqs;

import java.util.*;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// Scanner is used to read the data dynamically
		//Scanner is predefined class
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int num = s.nextInt();
		
		if(num%2==0) 
			System.out.println("Even!!!");
		else 
			System.out.println("Odd!!!");
		
	}

}
