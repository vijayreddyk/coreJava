package staticVariables;

public class CallStaticVariable {

	public static void main(String[] args) {
		staticVariableMethod s1 = new staticVariableMethod();
		s1.increaseStatic();
		s1.increaseStatic1();
		System.out.println(s1.staticVariable);
		System.out.println(s1.classVariable);
		staticVariableMethod s2 = new staticVariableMethod();
		s2.increaseStatic();
		s2.increaseStatic1();
		System.out.println(s2.staticVariable);
		System.out.println(s2.classVariable);
		staticVariableMethod s3 = new staticVariableMethod();
		s3.increaseStatic();
		s3.increaseStatic1();
		System.out.println(s3.staticVariable);
		System.out.println(s3.classVariable);
		//System.out.println(s1.a);
	}

}
