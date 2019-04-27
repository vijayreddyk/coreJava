package utilPackage;

import java.util.Arrays;

public class ExploringArrays {

	public static void main(String[] args) {
		int array[] = {1,45,67,24,57,78,94,62,31,47,69,49,23,29,51,59,62};
		int array1[] = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.equals(array, array1));
		System.out.println(Arrays.toString(Arrays.copyOfRange(array1, 4, 9)));
	}

}
