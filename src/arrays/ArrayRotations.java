package arrays;

import java.util.Arrays;

public class ArrayRotations {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9,10,11};
		int rotations = 5;
		for(int i=0;i<rotations;i++) {
			int temp = array[0];
			for(int j=0;j<array.length-1;j++) {
				array[j] = array[j+1];
				System.out.println(temp+" "+Arrays.toString(array));
			}
			array[array.length-1] = temp;
			System.out.println("After "+i+" Rotation "+Arrays.toString(array));
		}
	}

}
