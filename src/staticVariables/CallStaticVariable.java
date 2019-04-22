package staticVariables;

public class CallStaticVariable {

	public static void main(String[] args) {
		staticVariableMethod s1 = new staticVariableMethod();
		s1.increaseStatic();
		staticVariableMethod s2 = new staticVariableMethod();
		s2.increaseStatic();
		staticVariableMethod s3 = new staticVariableMethod();
		s3.increaseStatic();
		System.out.println(staticVariableMethod.a);
	}

}
