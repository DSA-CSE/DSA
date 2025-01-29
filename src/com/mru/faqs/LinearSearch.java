package com.mru.faqs;

public class LinearSearch {
	
	public static int linear_search(int[] arr, int search_element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == search_element) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int res = linear_search(new int[] {10,20,30,40,50},30);
		if(res!=-1) {
			System.out.println("Element found at index position: "+res);
		}else {
			System.out.println("Element not found!!!");
		}

	}

}
