package com.app.accessModifier;

public class SamePackageDifferentClass {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();

		// System.out.println(e.privId); Not accessible
		System.out.println(e.defId);
		System.out.println(e.proId);
		System.out.println(e.pubId);
	}

}
