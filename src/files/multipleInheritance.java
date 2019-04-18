package files;
interface A{
	public void show();
	public void method();
	public default void defaultMethod() {
		System.out.println("in default method of interface A");
	}
}

interface B{
	public void show();
	public default void defaultMethod() {
		System.out.println("in default method of interface B");
	}
}

class C implements A,B{

	@Override
	public void defaultMethod() {
		B.super.defaultMethod();
	}

	@Override
	public void show() {
		System.out.println("Inside interface c show() method");
	}

	@Override
	public void method() {
		System.out.println("Inside interface c method() method");
	}
}
class multipleInheritance {
	public static void main(String[] args) {
		C c = new C();
		c.defaultMethod();
	}

}
