package com.app.immutable;

// Note: All the primitive wrapper classes are immutable in java when we assign values to them using literal.
public class ImmutableClasses {

	static void modify(Integer i) {
		i = i + 1;
	}

	static void checkString() {
		System.out.println("--------------------");
		String s = "Mahesh";
		System.out.println(s.hashCode());

		s = "Napte";
		System.out.println(s.hashCode());
		
		System.out.println("--------------------");
		String s1 = new String("M1");
		String s2 = new String("M1");
		
		System.out.println(s1==s2);
		
		System.out.println("--------------------");
		String s3 = "M1";
		String s4 = "M1";	
		System.out.println(s3==s4);
		System.out.println("String method ends");
		
	}

	// v. v. nice demo to prove that primitive wrapper classes are immutable.
	// 1. even though i and j have same values, they are giving false when compared using == operator
	// 2. 
	static void checkPrimitiveWrapperClasses() {
		System.out.println("--------------------");
		Integer i = new Integer(10);
		System.out.println(i.hashCode());
		Integer j = i;
		i = 10;
		System.out.println(i.hashCode());

		System.out.println(i == j);
		
		System.out.println("--------------------");
		Integer k = new Integer(30);
		Integer l = new Integer(30);
		
		System.out.println(k==l);
		
		System.out.println("--------------------");
		Integer m = 40;
		Integer n = 40;
		
		System.out.println(m==n);
		System.out.println("PrimitiveWrappersClasses method ends");

	}
	
	static void checkOnlyPrimitiveDatatypes() {
		System.out.println("--------------------");
		int i = 10;
		System.out.println(i);
		int j = i;
		i = 10;
		System.out.println(i);

		System.out.println(i == j);
		
		System.out.println("--------------------");
		int k = 30;
		int l = 30;
		
		System.out.println(k==l);

	}

	public static void main(String[] args) {
		/*
		 * Integer i = new Integer(12); System.out.println(i); modify(i);
		 * System.out.println(i);
		 */

		checkString();
		checkPrimitiveWrapperClasses();
		checkOnlyPrimitiveDatatypes();
	}

}
