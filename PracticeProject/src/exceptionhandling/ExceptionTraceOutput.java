package exceptionhandling;

public class ExceptionTraceOutput {

	private static void p() throws Exception {
		try {
			System.out.println("1");
			int data = 5 / 0;
		} catch (ArithmeticException e) {

			System.out.println("Before throw");
			throw new Exception();
		} finally {
			System.out.println("In finally ... ");
		}
	}

	public static void main(String[] args) {
		try {
			p();
		} catch (Exception e) {
			System.out.println(e);

		}

		System.out.println("4");
	}

}
