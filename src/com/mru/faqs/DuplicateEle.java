package com.mru.faqs;

import java.util.HashSet;

public class DuplicateEle {

	public static void main(String[] args) {
		 
		int[] arr = {1,2,3,1,2,4};
		
		HashSet set = new HashSet();
		
		boolean flag = false;
		for(int ele : arr) {
			if(set.contains(ele)) {
				flag  = true;
				break;
			}else {
				set.add(ele);
			}
		}
		System.out.println(flag ? "Duplicates Available..." : "No Duplicates....");

	}

}
