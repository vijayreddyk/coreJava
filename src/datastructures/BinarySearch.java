package datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {1,43,32,67,89,49,75,51,8,40,100};
		Scanner s = new Scanner(System.in);
		int ele = s.nextInt();
		Arrays.sort(a);
		//System.out.println(Arrays.binarySearch(a, 74));
		binarySearch(a,ele);
		/**/
	}

	private static void binarySearch(int[] a, int ele) {
		int low=0;
		int high = a.length-1;
		System.out.println(Arrays.toString(a));
		while(low<=high) {
			int middleIndex = (low+high)/2;
			if(a[middleIndex] == ele) {
				System.out.println(middleIndex);
				break;
			} else if(a[middleIndex] < ele){
				low = middleIndex+1;
			} else if(a[middleIndex] > ele) {
				high = middleIndex-1;
			}
		}
	}

}
