package arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int array[] = {1,3,4,67,89,1045,1345,1784,2089,3041,3099,4567,10000,20000,30000};
		int start = 0;
		int end = array.length-1;
		while(start<end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(array));
	}

}
