package files;

import java.math.BigInteger;

public class autoBoxingUnboxing {

	public static void main(String[] args) {
		BigInteger bi1 = new BigInteger("1111111111111111111111111111111111111111111111111");
		BigInteger bi2 = new BigInteger("2222222222222222222222222222222222222222222222222");
		BigInteger bi3 = new BigInteger("1111111111111111111111111111111111111111111111111");
		System.out.println(bi1.equals(bi3));
	}

}
