package com.app.thisKeywordExample;

public class ThisKeywordClass {

	int p = 1;
	int q = 2;

	void iniInstanceVariables(int p, int q) {
		this.p = p;
		this.q = q;
		System.out.println(" p : " + p + ", q : " + q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordClass tk = new ThisKeywordClass();
		tk.iniInstanceVariables(4, 8);
		
		
		
	}

}
