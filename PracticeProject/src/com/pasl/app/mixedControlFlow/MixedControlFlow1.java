package com.pasl.app.mixedControlFlow;

public class MixedControlFlow1 {

	
	int i;
	private static String m1(String msg) {
		System.out.println(msg);
		return msg;
	}

	public MixedControlFlow1() {
		super();
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
