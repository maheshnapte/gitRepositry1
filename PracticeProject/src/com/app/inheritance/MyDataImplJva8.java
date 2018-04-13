package com.app.inheritance;

//public class MyDataImplJva8 implements MyData, MyData1
public class MyDataImplJva8 implements MyData {

	
//	 public void print(String str) {
//	 // if (!isNull(str))
//	 // System.out.println("MyData Print local::" + str);
//	
//	 System.out.println("In print local: " + str);
//	 }

	
	public boolean isNull(String str) {
		//super();
		//super.equals(null);
		System.out.println("Impl Null Check");

		return str == null ? true : false;
	}

	static void m1() {
		System.out.println(" I am in a static m1() method .. ");
	}

	void m2() {
		System.out.println(" I am in a static m2() method .. ");
	}

	public static void main(String args[]) {
		MyDataImplJva8 obj = new MyDataImplJva8();

		MyDataImplJva8 obj1 = null;
		// obj.print("abc");
		obj.isNull("abc");

		// System.out.println(MyDaisNull(null));
		// obj1.m2();
	}
}