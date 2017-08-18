package com.app.overriding;

class Bike {
	int speedlimit = 90;
}

class Honda3 extends Bike {
	int speedlimit = 150;
}

public class RuntimePolymorphismOnDtataMembersNotPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Honda3();
		System.out.println(obj.speedlimit);// 90
	}

}
