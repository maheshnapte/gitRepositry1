package com.app;
// showing mutiple inheritance ...

interface A {
	abstract void display();
	static int cube(int x){return x*x*x;}  
}

interface B {
	public void display();
	default void msg(){System.out.println("default method");}  
}

//abstract class C implements A, B {
//
//	public abstract void display();
//	final void test(){
//		
//	}
////	@Override
////	public void display() {
////		// TODO Auto-generated method stub
////		System.out.println("Display method overridden ...");
////	}
//
//}


class C implements A, B {

//	public abstract void display();
	final void test(){
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method overridden ...");
	}
	
	public void msg(){
		System.out.println("hello bhai, msg()s is overriden ...");
	}

}
public class InterfacaeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c = new C();
		c.display();
		c.msg();
	
		System.out.println(A.cube(2));
	}

}
