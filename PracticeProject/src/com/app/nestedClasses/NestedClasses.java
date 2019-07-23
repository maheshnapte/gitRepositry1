package com.app.nestedClasses;

interface outInterface {

	public static final class classInsideInterface {
		void localMethod() {
			System.out.println("Hi");
			class localClass {

			}
		}

		class MemberClass {
			private class InnerMemberClass {

			}
		}
	}
}

class Par {
	private int p = 10;

	private static int s = 10;

	// Interface inside class
	interface InnerInterface {

	}

	class Chi {
		void msg() {
			System.out.println("Inner :" + p);
		}

		class MemberInnerInnerClass {
			class MemberInnerInnerInnerClass {
				void localLocalMethod() {
					class InnerInnerClass {

					}
				}
			}
		}
	}

	static class StaChi {
		static void msg() {
			System.out.println("Can acess static members directly :" + s);

			System.out.println("Need to create Object of class to access member variables :" + new Par().p);
		}

		static void nonStaticMsg() {
			System.out.println("Can acess static members directly :" + s);
			System.out.println("Need to create Object of class to access member variables :" + new Par().p);
		}
	}

	public static void main(String[] args) {
		// Way to access Member inner class
		Par p = new Par();
		Par.Chi c = p.new Chi();
		c.msg();

		p.localMethod();

		// Way to access static inner class
		StaChi.msg();

		StaChi s = new StaChi();
		s.nonStaticMsg();
	}

	void localMethod() {

		// It is not allowedhere.
		/*
		 * interface InterfaceInMethod {
		 * 
		 * }
		 */
		int i = 10;

		class localInnerClass {

			void m() {
				System.out.println("i: " + i);
			}

			void localLocalMethod() {

				class InnerInnerClass {

					class Ccc {

					}

					// It is not allowed here
					// The member interface III can only be defined inside a top-level class or
					// interface or in a static context
					/*
					 * interface III {
					 * 
					 * }
					 */
				}

			}
		}

		localInnerClass ii = new localInnerClass();

		System.out.println("reached here...");
		ii.m();
	}
}

public class NestedClasses {

	public static void main(String[] args) {
		// Way to access Member inner class
		Par p = new Par();
		Par.Chi c = p.new Chi();
		c.msg();

		// Way to access static inner class
		Par.StaChi.msg();

		Par.StaChi s = new Par.StaChi();
		s.nonStaticMsg();
	}

}
