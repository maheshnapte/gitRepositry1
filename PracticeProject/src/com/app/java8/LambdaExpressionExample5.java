package com.app.java8;

interface Drawable {
	public void draw();
}

interface Addable {
	int add(int a, int b);
}

interface MyTest {
	static void hello() 
    { 
        System.out.println("Hello, New Static Method Here"); 
    } 
	
	default void test()
	{
		System.out.println("I am default method");
	}
	public void testMe();
	
	default String returnTest(int i) {
		return "works";
	}
	
	static String staticReturnCheck(int i) {
		return "static return check";
	}
}

public class LambdaExpressionExample5 {
	public static void main(String[] args) {
		int width = 10;
		// without lambda, Drawable implementation using anonymous class
		Drawable d = new Drawable() {
			public void draw() {
				System.out.println("Drawing with anonymous class: " + width);
			}
		};
		d.draw();
		
		// with lambda expression
		Drawable d1 = () -> System.out.println("Drawing with lambda: " + width);
		d1.draw();
		
		// Multiple parameters in lambda expression
		Addable ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 20));

		// Multiple parameters with data type in lambda expression
		Addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));
		
		//
	
	// 	Conclusion: functional interface can have static and default method.
		MyTest t = () -> System.out.println("Bhai");
	    t.testMe();
	    t.test();
	    MyTest.hello();
	}
}