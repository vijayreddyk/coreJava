package files;
class ClassWithStaticMethod{
	int a=999;
	static void staticInterfaceMethod() {
		System.out.println("Inside of static method in a class");
	}
}
public class StaticClassInheritance extends ClassWithStaticMethod implements TestInterface11{

	public static void main(String[] args) {
		TestInterface11.staticInterfaceMethod();
		
		System.out.println();
	}

}
