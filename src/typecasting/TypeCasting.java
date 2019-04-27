package typecasting;

public class TypeCasting {

	public static void main(String[] args) {
		byte byteVar = 1;
		short shortVar = (short) byteVar;
		int intVar = (int) shortVar;
		long longVar = (long) intVar;
		intVar = (int) longVar;
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		
	}

}
