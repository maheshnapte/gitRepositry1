package com.app.immutable;

public class ImmutableAccessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableEmployee eM = new ImmutableEmployee("Mahesh", 2);
		ImmutableEmployee eM1 = new ImmutableEmployee("Mahesh1", 12);

		// ImmutableEmployee eM = new ImmutableEmployee("Mahesh");
		// System.out.println(eM.getPancardNumber());

		System.out.println(eM);
		System.out.println(eM1);
	}

}
