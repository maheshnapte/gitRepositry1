package com.app.string;

public class StringDemo {

	static private void test() {
		String s1 = "java";// creating string by java string literal
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		String s2 = new String(ch);// converting char array to string
		String s3 = new String("example");// creating java string by new keyword
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println(s1.contains("av"));
	}

	static private void test1() {
		String s1 = "welcome to split world";
		System.out.println("---");
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 0)) {
			System.out.println(w);
		}

	}

	// usig charAt method
	private static void traverseString() {
		String s = "Mahesh";

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

	private static void traverseStringUsingCharArray() {
		String s = "Mahesh";

		char cA[] = s.toCharArray();

		for (int i = 0; i < cA.length; i++) {
			System.out.println(cA[i]);
		}
	}

	private static void checkStringIsImmutable() {
		String s = "Sachin";
		String s1 = s;
		s = s.concat(" Tendulkar");// concat() method appends the string at the
									// end
		System.out.println(s);// will print Sachin because strings are immutable
								// objects

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

	public static void StringComparison() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		s2.concat("pp");

		String s3 = new String("Sachin");
		String s4 = s3.intern();
		System.out.println(s1 == s2);// true (because both refer to same
										// instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance
										// created in nonpool)
		System.out.println(s1.equals(s3));
	}

	private static void stringCompareTo() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Watan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}

	private static void trick() {
		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);// 80Sachin4040

	}

	private static void toLowerUpperCase() {
		String s = new String("Mahesh");

		System.out.println(s.toUpperCase());
		System.out.println(s.hashCode());
	}

	private static void provesStringBufferAndStrinBuilderAreMutable() {
		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);// prints olleH

		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
			// sb.append("p");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubf
		// test();
		// test1();
		// traverseString();s
		// checkStringIsImmutable();

		// StringComparison();
		// stringCompareTo();
		// trick();
		// toLowerUpperCase();
		provesStringBufferAndStrinBuilderAreMutable();
	}

}

class ModifyStringsInMultithreadedEnvironment extends Thread {

	// static StringBuffer s = new StringBuffer("Mahesh Napte is stud");

	static StringBuilder s = new StringBuilder("Mahesh Napte is stud");

	public void run() {
		System.out.println("Modifying StringBuffer");

		s.replace(0, 6, "Nilesh");
		// try {
		// Thread.sleep(100);
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// s.append("yyy");

	}

	static int getCount(String s, char c) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
			{
				count++;
			}
		}
		return count;
	}

	private static void checkForEvenString() {
		String s = "aaabbbccc";
		int repeat = 0;
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			 char c = s.charAt(i);
			if (i == 0) {
//				System.out.println(repeat+" "+getCount(s, s1));
				repeat = getCount(s, c);
				System.out.println(repeat);
			} else {
				System.out.println(repeat+" "+getCount(s, c));
				if (repeat != getCount(s, c)) {
					flag = false;
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("Not an even String ...");
		} else {
			System.out.println("Even String...");
		}
	}

	public static void main(String args[]) throws InterruptedException {

		// ModifyStringsInMultithreadedEnvironment t = new
		// ModifyStringsInMultithreadedEnvironment();
		// t.start();
		//// ModifyStringsInMultithreadedEnvironment t1 = new
		// ModifyStringsInMultithreadedEnvironment();
		//// t1.start();
		// for (int j = 0; j < 3; j++){
		//
		//
		// for (int i = 0; i < s.length(); i++) {
		// System.out.println(s.charAt(i));
		// Thread.sleep(1000);
		// }}

		// String a = "a";
		// String b = a + "b";
		//
		// String c = "a" + "b";
		//
		// System.out.println(a.hashCode() + " " + b.hashCode() + " " +
		// c.hashCode());
		//
		// System.out.println(b == c);

		checkForEvenString();

	}

}
