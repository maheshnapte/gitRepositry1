package com.app.cloning;

class Village{

	String village;

	public Village(String village) {
		super();
		this.village = village;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "Village [village=" + village + "]";
	}

}

class Student18 implements Cloneable {
	int rollno;
	String name;
	Village vil;

	{
		System.out.println("In instance initializer block.");
	}

	Student18(int rollno, String name, Village vil) {
		System.out.println("In constructor Student18(int rollno, String name) ");
		this.rollno = rollno;
		this.name = name;
		this.vil = vil;
	}

	public Object clone() throws CloneNotSupportedException {
		return (Student18)super.clone();
	}

	
	  
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Village getVil() {
		return vil;
	}

	public void setVil(Village vil) {
		this.vil = vil;
	}

	
	@Override
	public String toString() {
		return "Student18 [rollno=" + rollno + ", name=" + name + ", vil=" + vil + "]";
	}

	public static void main(String args[]) {
		try {

			Village vLocal = new Village("Karandi");
			Student18 s1 = new Student18(101, "amit", vLocal);

			Student18 s2 = (Student18) s1.clone();

			// s1.name = "kiran";
			// s2.name = "kumar";
			System.out.println(s1);
			System.out.println(s2);
			

//			vLocal.setVillage("Pabal");
			
			s1.setVil(new Village("Kendur"));

			System.out.println(s1);
			System.out.println(s2);

			if (s1 == s2) {
				System.out.println("references are same");
			} else {
				System.out.println("references are not same");
			}

			// if (s1.equals(s2)) {
			// System.out.println("values are same");
			// } else {
			// System.out.println("values are not same");
			// }

		} catch (CloneNotSupportedException c) {
		}

	}
}