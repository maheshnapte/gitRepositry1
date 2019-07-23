package com.app.immutable;

final  public class ImmutableEmployee {

	final String pancardNumber;
	final int id;

	public ImmutableEmployee(String pancardNumber, int id) {
		this.pancardNumber = pancardNumber;
		this.id = id;
	}

	// public ImmutableEmployee(String pancardNumber) {
	// this.pancardNumber = pancardNumber;
	// }

	public String getPancardNumber() {
		return pancardNumber;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + pancardNumber + " " + id + "]";
	}

}
