package com.app.nestedClasses;

interface outInterface {
	
	public static final class classInsideInterface {
		void localMethod() {
			System.out.println("Hi");
			class localClass {

			}
		}
		
		class MemberClass
		{
			private class InnerMemberClass
			{
				
			}
		}
	}
}

class Par {
	int p = 10;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Par p = new Par();
		Par.Chi c = p.new Chi();
		c.msg();

	}

	void localMethod() {

		class localInnerClass {

			void localLocalMethod() {
				class InnerInnerClass {

				}
			}
		}
	}
}

public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
