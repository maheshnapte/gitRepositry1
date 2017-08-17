package com.app;

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

//		CrunchifyEnumCompany.valueOf("ebay");
		
		
		System.out.println(CrunchifyEnumCompany.valueOf("ebay".toUpperCase()).getCompanyLetter());
	}

}
