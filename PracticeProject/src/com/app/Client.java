package com.app;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "maesh";
		char c = str.charAt(0);

		char[] cArr = str.toCharArray();
		// bubble sort
		for (int i = 0; i < cArr.length-1; i++) {
			for (int j = 0; j < cArr.length - j; j++) {
				if (cArr[j] > cArr[j + 1]) {
					char t;
					t = cArr[j + 1];
					cArr[j + 1] = cArr[j];
					cArr[j] = t;
				}
			}
		}

		System.out.println(cArr);

		// = 'P';

		// for (int i = 0; i < cArr.length-1; i++) {
		// System.out.println(i + " " + cArr[i]);
		// }
	}

}
