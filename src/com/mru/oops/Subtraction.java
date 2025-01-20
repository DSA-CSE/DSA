package com.mru.oops;

public class Subtraction extends Addition implements SubtractionInterface {

	@Override
	public void sub1() {
		int num1 = 320;
		int num2 = 130;
		int res = num1-num2;
		
		System.out.println(res);
	}

	@Override
	public void sub2(int num1, int num2) {
		int res = num1-num2;
		System.out.println(res);

	}

	@Override
	public int sub3() {
		int num1 = 230;
		int num2 = 100;
		int res = num1-num2;
		return res;
	}

	@Override
	public int sub4(int num1, int num2) {
		int res = num1-num2;
		return res;
	}

}
