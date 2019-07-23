package com.psl.app.instanceControlFlow;

public class InstanceControlFlowDemo {
	int i = 10;

	{
		m1();
		System.out.println("First instance Flow");
	}

	InstanceControlFlowDemo() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceControlFlowDemo i1 = new InstanceControlFlowDemo();
		System.out.println("Main");
		System.out.println();
		InstanceControlFlowDemo i2 = new InstanceControlFlowDemo();
	}

	public void m1() {
		System.out.println("j: " + j);
	}


	{
		System.out.println("Second instance block");
	}
	int j = 20;
}
