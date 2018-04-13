package exceptionhandling;

import exceptionhandling.Java7ResourceManagement.MyResource;

public class TryWithResource {

	public static void main(String[] args) throws Exception {

		System.out.println();
		tryWithResourceException();
	}

	private static void tryWithResourceException() {
		try (MyResource mr = new MyResource()) {
			System.out.println("MyResource created in try-with-resources");
			int c =12/0;
			System.out.println("Here");
		} catch (Exception e) {
			System.out.println("Exception e"+e);
		} finally {
			System.out.println("I am in finally..");
		}
	}

	static class MyResource implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("Closing MyResource");
		}

	}
}