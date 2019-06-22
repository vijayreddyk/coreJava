package java8;

public class OuterClass {
	//nested inner class
	abstract class InnerClass{
		public void methodA() {
			System.out.println("In inner class public method");
			methodB();
		}
		private void methodB() {
			System.out.println("In inner class private method");
			methodD();
			methodE();
		}
		abstract void methodAB();
	}
	//nested inner class inheritance
	class InnerClass1 extends InnerClass{
		public void methodC() {
			System.out.println("In inner class public method");
			super.methodB();
			methodD();
			methodE();
		}

		@Override
		void methodAB() {
			// TODO Auto-generated method stub
			
		}
	}
	
	public void methodD() {
		System.out.println("In public method of outer class");
	}
	
	private void methodE() {
		int a=90;
		class methodLocalInnerClass{
			public void methodE1() {
				System.out.println("inside method inner class "+(a));
			}
		}
		methodLocalInnerClass mcic = new methodLocalInnerClass();
		mcic.methodE1();
		System.out.println("In private method of outerclass");
	}
	public static void main(String[] args) {
		OuterClass.InnerClass1 ic1 = new OuterClass().new InnerClass1();
		ic1.methodC();
		OuterClass oc = new OuterClass();
		oc.methodE();
	}
}
