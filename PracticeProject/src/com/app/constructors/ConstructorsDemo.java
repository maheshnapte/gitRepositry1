package com.app.constructors;

public class ConstructorsDemo {
	final int f;
	int id;
	
	ConstructorsDemo(int ff,int id)
	{
		f=ff;
		this.id = id;
	}
	
	
	
	@Override
	public String toString() {
		return "ConstructorsDemo [f=" + f + ", id=" + id + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ConstructorsDemo c = new ConstructorsDemo();
		
		ConstructorsDemo c = new ConstructorsDemo(10,20);
		
		ConstructorsDemo c1 = new ConstructorsDemo(11,21);

		System.out.println(c);
		System.out.println(c1);

		System.out.println(c);


	}

}
