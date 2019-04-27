package staticVariables;

public class PrivateStaticMethods {
	
	public static void main(String[] args) {
		PrivateStaticMethodsClass.callPrivateStaticMethod();
		//PrivateStaticMethodsClass.demoMethod();
	}

}

class PrivateStaticMethodsClass{
	
	public static void callPrivateStaticMethod() {
		System.out.println("in public static method");
		demoMethod();
	}
	private static void demoMethod() {
		System.out.println("in private static method");
	}
}