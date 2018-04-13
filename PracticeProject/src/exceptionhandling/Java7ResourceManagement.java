package exceptionhandling;

public class Java7ResourceManagement {

	public static void main(String[] args) throws Exception {

		try {
			System.out.println("Executing normalTryException() method");
			normalTryException();
		} catch (Exception e) {
			System.out.println("in catch: "+e);
		}

		System.out.println();
		try {
			System.out.println("Executing tryWithResourceException() method");
			tryWithResourceException();
		} catch (Exception e) {
			System.out.println("in catch: "+e);
		}

	}

	private static void normalTryException() throws Exception {
		MyResource mr = null;
		try {
			mr = new MyResource();
			System.out.println("MyResource created in try block");
			if (true)
				throw new Exception("Exception in try");
			

		} finally {
			if (mr != null)
				mr.close();
		}

	}

	private static void tryWithResourceException() throws Exception {
		try (MyResource mr = new MyResource()) {
			System.out.println("MyResource created in try-with-resources");
			if (true)
				throw new Exception("Exception in try");
		}
	}

	static class MyResource implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("Closing MyResource");
			throw new Exception("Exception in Closing");
		}

	}
}