package interfaces;

public interface Vehicle {
	int noOfWheels();
	public String name();
	int milege();
	default int engineMethod() {
		return 0;
	}
	static int engineStaticMethod() {
		return 1;
	}
	static int engineStaticMethod(int a) {
		return 10+a;
	}
}
