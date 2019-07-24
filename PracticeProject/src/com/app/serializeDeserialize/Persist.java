package com.app.serializeDeserialize;

import java.io.*;

class Persist{
	
	
	public static void main(String args[]) {
		
		FileOutputStream fout= null;
		ObjectOutputStream out=null;
		try {
			// Creating the object
			Student s1 = new Student(1, "ravi", 21,11);
			System.out.println(s1);
			// Creating stream and writing the object
			fout = new FileOutputStream("f");
			out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			
			out.flush();
			// closing the stream
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				out.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}