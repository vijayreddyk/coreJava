package InnerClasses;

public class InnerClassDemo {
	//inner class
	class InnerClass{
		private int var1;
		public int var2;
		public InnerClass(int var1,int var2) {
			this.var1 = var1;
			this.var2 = var2;
		}
		public int sum() {
			methoodOuterClass();
			return this.var1+this.var2;
		}
	}
	public void methoodOuterClass() {
		System.out.println("In method of outer class");
	}
	//Static inner class
	static class StaticInnerClass{
		static void methodStaticNestedClass() {
			System.out.println("In static method of static nested class");
		}
		public void nonstaticmethodNestedClass() {
			InnerClassDemo.InnerClass icd = new InnerClassDemo().new InnerClass(5, 6);
			System.out.println(icd.sum());
			System.out.println("In non static method of static nested class");
		}
	}
	public static void main(String[] args) {
		StaticInnerClass si = new StaticInnerClass();
		//InnerClassDemo.staticInnerClass icd = new InnerClassDemo().staticInnerClass;
		//icd.nonstaticmethodNestedClass();
		si.nonstaticmethodNestedClass();
		si.methodStaticNestedClass();
		StaticInnerClass.methodStaticNestedClass();
		InnerClassDemo.InnerClass ic = new InnerClassDemo().new InnerClass(2, 3);
		ic.sum();
	}
}
