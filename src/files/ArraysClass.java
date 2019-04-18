package files;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5,6,7,8,9};
		char charArray[] = {'a','b','c','d','e'};
		int intArray2[] = Arrays.copyOf(intArray, 20);
		char charArray2[] = Arrays.copyOf(charArray, 10);
		
		System.out.println(Arrays.toString(intArray2));
		System.out.println(Arrays.toString(charArray2));
	}

}
