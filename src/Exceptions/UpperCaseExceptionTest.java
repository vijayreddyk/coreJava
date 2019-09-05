package Exceptions;

public class UpperCaseExceptionTest {
	private static String methodA(String str) throws UpperCaseStringException{
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				throw new UpperCaseStringException("Uppercase letters found");
			}
		}
		return new StringBuilder(str).reverse().toString();
	}
	public static void main(String[] args) {
		try {
			System.out.println(methodA("wHere"));
		} catch (UpperCaseStringException e) {
			e.printStackTrace();
		}
	}

}
