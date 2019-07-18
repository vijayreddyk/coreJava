package arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7};
		rotateLeft(array,2);
	}

	private static void rotateLeft(int[] array, int noOfPositions) {
		for(int i=0;i<noOfPositions;i++) {
			int temp = array[0];
			for(int j=0;j<array.length-1;j++) {
				array[j] = array[j+1];
			}
			array[array.length-1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
