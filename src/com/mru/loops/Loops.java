package com.mru.loops;

public class Loops {

	public static void main(String[] args) {

		int[] arr1 = {10,20,30,40,50};
		int e1 = arr1[0];
		int e2 = arr1[3];
		int e3 = arr1[2];
		int e4 = arr1[4];
		int e5 = arr1[1];
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		int n = arr1.length;
		System.out.println("No.of elements in the array: "+n);
		
		//for loop
		System.out.println("For Loop: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
		
		//while loop
		System.out.println("While Loop: ");
		int x=0;
		while(x<n) {
			
			System.out.println(arr1[x]);
			x++;
		}
		System.out.println("Do While Loop: ");
		int y=0;
		do {
			System.out.println(arr1[y]);
			y++;
		}while(y<n);
	}

}
