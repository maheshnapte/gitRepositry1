package com.app;


public class FinalizeExample {
	public void finalize() {
		System.out.println("finalize called");
	}

//	Here, my doubt is why finalize() method is only called for f1 and f2 and not for o and s.
	public static void main(String[] args) {
		FinalizeExample f1 = new FinalizeExample();
		FinalizeExample f2 = new FinalizeExample();
		f1 = null;
		f2 = null;
		Object o = new Object();
		o=null;
		String s= new String("MAHESH");
		s=null;
		
		System.gc();
	}
}