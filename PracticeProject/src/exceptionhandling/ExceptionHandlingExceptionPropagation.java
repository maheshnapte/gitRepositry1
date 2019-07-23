package exceptionhandling;

import java.util.logging.Level;
import java.util.logging.Logger;

//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
class TestExceptionPropagation2 {
	

    private final static Logger LOGGER =  
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
    
	void m() {
		 LOGGER.log(Level.INFO, "m()"); 
		 try {
			int data = 50 / 0;
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		//throw new java.io.IOException("device error");// checked exception
			}

	void n() {
		 LOGGER.log(Level.INFO, "n()"); 	
		m();
	}

	void p() {
		 LOGGER.log(Level.INFO, "p()"); 	
		// n();
		try {
			n();
		} catch (Exception e) {
			 LOGGER.log(Level.SEVERE,e.getMessage()); 	
			 e.printStackTrace();
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		 LOGGER.log(Level.INFO, "Before calling obj.p()"); 	
		obj.p();
		 LOGGER.log(Level.INFO, "After calling obj.p()"); 	

		System.out.println("normal flow");
	}
}

// Rule: By default Unchecked Exceptions are forwarded in calling chain
// (propagated).
class TestExceptionPropagation1 {
	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		n();
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		
			obj.p();
		 /*catch (Exception e) {
			System.out.println("Exception: " + e);
		}*/
		System.out.println("normal flow...");
	}
}

public class ExceptionHandlingExceptionPropagation {

	public static void main(String[] args) {

	}
}
