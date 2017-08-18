package com.app.internationlizationAndLocalization;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationAndLocalization {

	public static void main(String[] args) {
//		Locale enLocale = new Locale("en", "US");
//		Locale frLocale = new Locale("fr", "FR");
//		Locale esLocale = new Locale("es", "ES");
//		System.out.println("English language name (default): " + enLocale.getDisplayLanguage());
//
//		System.out.println("English language name in French: " + enLocale.getDisplayLanguage(frLocale));
//		System.out.println("English language name in spanish: " + enLocale.getDisplayLanguage(esLocale));

	

//		try {
//
////			File file = new File("MessageBundle_en_US.properties");
//
//			File file = new File("MessageBundle_in_ID.properties");
//
//			if (file.createNewFile()) {
//				System.out.println("File is created!");
//			} else {
//				System.out.println("File already exists.");
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// System.out.println(frLocale.toLanguageTag());resourceBundleKey Code
		// starts
		
		Locale enLocale = new Locale("en", "US");

		ResourceBundle bundle = ResourceBundle.getBundle("com/app/us", enLocale);
		System.out.println("Message :" + bundle.getString("greeting"));


	}
}
