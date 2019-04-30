package langPackage;

public class Exdfg {

	public static void main(String[] args) {
		try {
			int a=4/0;
		} finally {
			System.out.println("in final block");
		}
	}
}
