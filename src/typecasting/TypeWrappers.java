package typecasting;

public class TypeWrappers {

	public static void main(String[] args) {
		try {
			Integer i = new Integer("2147483647");
			System.out.println(i);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

}
