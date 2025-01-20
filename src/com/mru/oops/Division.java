package com.mru.oops;

public class Division extends Addition implements DivisionInterface {

	@Override
	public void div1() {
		int num1 = 124;
		int num2 = 4;
		int res = num1/num2;
		
		System.out.println(res);	}

	@Override
	public void div2(int num1, int num2) {
		int res = num1/num2;
		System.out.println(res);
	}

	@Override
	public int div3() {
		int num1 = 12;
		int num2 = 3;
		int res = num1/num2;
		return res;
	}

	@Override
	public int div4(int num1, int num2) {
		int res = num1/num2;
		return res;
	}

}
