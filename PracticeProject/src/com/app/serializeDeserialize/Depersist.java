package com.app.serializeDeserialize;

import java.io.*;

class Depersist {
	public static void main(String args[]) {
		
		//ObjectInputStream in=null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("f"))){
			// Creating stream to read the object
			//in = new ObjectInputStream(new FileInputStream("f.txt"));
			Student s = (Student) in.readObject();
			// printing the data of the serialized object
			System.out.println(s);
			// closing the stream
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		/*finally
		{
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}