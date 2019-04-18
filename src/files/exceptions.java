package files;

import com.kvr.exceptions.evenNumberException;

public class exceptions {

	public static void main(String[] args) {
		int a = 5;
		try {
			if(a%2==0) {
				System.out.println("It is Even number");
			} else {
				throw new evenNumberException(2);
			}
		} catch (evenNumberException e) {
			System.out.println("In even number exception");
		} finally {
			System.out.println("In final block");
		}
	}
	private static int evenNumExcep(int num) throws evenNumberException {
		if(num%2==0) {
			return 0;
		} else {
			return 1;
		}
	}
}
