package com.mru.oops;

public class Multiplication extends Addition implements MultiplicationInterface {

	@Override
	public void mu1() {
		int num1 = 119;
		int num2 = 4;
		int res = num1*num2;
		
		System.out.println(res);
	}

	@Override
	public void mul2(int num1, int num2) {
		int res = num1*num2;
		System.out.println(res);
	}

	@Override
	public int mul3() {
		int num1 = 12;
		int num2 = 8;
		int res = num1*num2;
		return res;

	}

	@Override
	public int mul4(int num1, int num2) {
		int res = num1*num2;
		return res;
	}

}
