package com.pasl.app.mixedControlFlow;

public class MixedControlFlow {

	{
		System.out.println("F IB");
	}

	static {
		System.out.println("G SB");
	}

	public static void main(String[] args) {

		MixedControlFlow t1 = new MixedControlFlow();

		System.out.println("Main");
		MixedControlFlow t2 = new MixedControlFlow();
	}

	static {
		System.out.println("S SB");
	}

	{
		System.out.println("S IB");
	}
}
