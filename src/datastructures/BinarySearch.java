package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {1,43,32,67,89,49,75,51,61,8,40,100};
		Scanner s = new Scanner(System.in);
		int ele = s.nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 74));
		/*int firstIndex = 0;
		int lastIndex = a.length;
		int middleIndex = a.length/2;
		Arrays.sort(a);
		while(true) {
			System.out.println(Arrays.toString(a)+" "+middleIndex);
			if(a[middleIndex] == ele) {
				System.out.println(middleIndex);
				break;
			} else if(a[middleIndex] < ele){
				middleIndex = (middleIndex+lastIndex)/2;
			} else if(a[middleIndex] > ele) {
				middleIndex = middleIndex/2;
			}
		}*/
	}

}
