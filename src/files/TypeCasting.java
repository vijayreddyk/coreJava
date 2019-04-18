package files;

public class TypeCasting {

	public static void main(String[] args) {
		byte byteVar = 0;
		short shortVar = 0;
		int intVar = 0;
		long longVar = 0;
		float floatVar = 0;
		double doubleVar = 0;
		String stringVar = null;
		boolean booleanVar = false;
		Byte byteclassVar;
		Short shortclassVar;
		Integer intclassVar;
		Long longclassVar;
		Float floatclassVar;
		Double doubleClassVar;
		Boolean booleanclassVar;
		byteVar = 127;//max value of byte
		shortVar = 32767;//max value of short
		intVar = (int) (Math.pow(2, 33)-1);
		longVar = (long) (Math.pow(2, 64)-1);
		floatVar = (float) (Math.pow(2, 32)-1);
		doubleVar = Math.pow(2, 64)-1;
		booleanVar = (0 == 1);
		System.out.println(byteVar);
		System.out.println(shortVar);
		System.out.println(intVar);
		System.out.println(longVar);
		System.out.println(floatVar);
		System.out.println(doubleVar);
		System.out.println(stringVar);
		System.out.println(booleanVar);
	}

}
