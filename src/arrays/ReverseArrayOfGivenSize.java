package arrays;

import java.util.Arrays;

public class ReverseArrayOfGivenSize {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int k=15;
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		reverseOfFixedSize(arr,k,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void reverseOfFixedSize(int[] arr, int k, int n) {
		int chunk_size = n/k;
		int startIndex = 0;
		int endIndex = k-1;
		while(chunk_size>=0) {
			//while(startIndex<endIndex) {
			if(endIndex>n) {
				endIndex = n-1;
			}
			reverseArrayOfFixedIndexes(arr,startIndex,endIndex);
			//	startIndex++;
			//}
			startIndex +=k;
			endIndex += k;
			chunk_size--;
		}
	}

	private static void reverseArrayOfFixedIndexes(int[] arr, int startIndex, int endIndex) {
		int temp = 0;
		while(startIndex<endIndex) {
			temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}

}
