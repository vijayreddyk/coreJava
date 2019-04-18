package files;

import com.kvr.exceptions.evenNumberException;

public class numbers {

	public static void main(String[] args) throws evenNumberException {
		for(int i=1;i<=10;i++) {
			method(i);
		}
	}
	public static void method(int num) throws evenNumberException {
		if(num%2 == 0)
			throw new evenNumberException(num);
	}
}
