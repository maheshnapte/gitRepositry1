package com.app.inheritance;

public interface MyData {

	default void print(String str) {
		
		System.out.println("In print interfatce: "+str );
//		if (!isNull(str))
//			System.out.println("MyData Print::" + str);
	}

	static boolean isNull(String str) {
		System.out.println("Interface Null Check");

		return str == null ? true : "".equals(str) ? true : false;
	}
}
