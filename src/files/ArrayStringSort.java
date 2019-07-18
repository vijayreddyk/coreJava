package files;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayStringSort {

	public static void main(String[] args) {
		String str[] = {"bat","badminton","apple","ace","cat","catalyst"};
		List<String> list = Arrays.asList(str);
		int index = Arrays.binarySearch(str,"ace");
		System.out.println(index);
		Collections.sort(list);
		System.out.println(list);
	}

}
