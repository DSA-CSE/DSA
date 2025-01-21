package com.mru.faqs;

import java.util.*;

public class AddEleDynamically {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Array length: ");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter elements in the array: ");
			arr[i] = s.nextInt();
			}
		for(int element : arr) {
			System.out.println(element+" ");
		}
		
	}

}
