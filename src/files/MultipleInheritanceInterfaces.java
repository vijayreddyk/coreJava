package files;

import staticVariables.staticVariableMethod;

interface TestInterface11{
	int interfaceVar = 999;
	static void staticInterfaceMethod() {
		System.out.println("In interface1 static method");
	}
	default void defaultMethod() {
		System.out.println("In interface1 method");
	}
}

interface TestInterface22{
	static void staticInterfaceMethod() {
		System.out.println("In interface2 static method");
	}
	default void defaultMethod() {
		System.out.println("In interface2 method");
	}
}

public class MultipleInheritanceInterfaces implements TestInterface11{

	public static void main(String[] args) {
		MultipleInheritanceInterfaces mii = new MultipleInheritanceInterfaces();
		mii.defaultMethod();
		TestInterface11.staticInterfaceMethod();
		System.out.println(mii.interfaceVar);
	}




}
