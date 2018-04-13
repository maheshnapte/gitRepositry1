package com.app.eum;

import java.io.Closeable;
import java.io.IOException;

public class EnumDemo {

	public enum CrunchifyEnumCompany {

		GOOGLE("G"), YAHOO("Y"), EBAY("E"), PAYPAL("P");

		private String companyLetter;

		private CrunchifyEnumCompany(String s) {
			companyLetter = s;
		}

		public String getCompanyLetter() {
			return companyLetter;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CrunchifyEnumCompany.valueOf("ebay");

		System.out.println(CrunchifyEnumCompany.valueOf("ebay".toUpperCase()).getCompanyLetter());
	}

}

// Jornaldev example
/**
 * This Enum example shows all the things we can do with Enum types
 *
 */
enum ThreadStatesEnum implements Closeable {
	START(1) {
		@Override
		public String toString() {
			return "START implementation. Priority=" + getPriority();
		}

		@Override
		public String getDetail() {
			return "START";
		}
	},
	RUNNING(2) {
		@Override
		public String getDetail() {
			return "RUNNING";
		}
	},
	WAITING(3) {
		@Override
		public String getDetail() {
			return "WAITING";
		}
	},
	DEAD(4) {
		@Override
		public String getDetail() {
			return "DEAD";
		}
	};

	private int priority;

	public abstract String getDetail();

	// Enum constructors should always be private.
	private ThreadStatesEnum(int i) {
		priority = i;
	}

	// Enum can have methods
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int p) {
		this.priority = p;
	}

	// Enum can override functions
	@Override
	public String toString() {
		return "Default ThreadStatesConstructors implementation. Priority=" + getPriority();
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close of Enum");
	}
}