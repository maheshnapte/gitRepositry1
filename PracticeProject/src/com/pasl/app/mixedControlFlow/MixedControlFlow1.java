package com.pasl.app.mixedControlFlow;

public class MixedControlFlow1 {

	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}

	public MixedControlFlow1() {
		m = m1("1");
	}

	{
		String m = m1("2");
	}

	String m = m1("3");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new MixedControlFlow1();
	}

}
