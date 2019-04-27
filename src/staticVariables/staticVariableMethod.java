package staticVariables;

public class staticVariableMethod {
	static int staticVariable = 0;
	int classVariable = 0;
	public void increaseStatic() {
		staticVariable++;
		classVariable++;
	}
	public static void increaseStatic1() {
		staticVariable++;
	}
}
