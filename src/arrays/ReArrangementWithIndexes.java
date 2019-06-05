package arrays;

import java.util.Arrays;

public class ReArrangementWithIndexes {

	public static void main(String[] args) {
		int array[]  = {1,-1,2,3,6,-1,4,8,-1,0};
		for(int i=0;i<array.length;i++) {
			if(array[i] == i || array[i]==-1)
				continue;
			else {
				int temp = array[array[i]];
				array[array[i]] = array[i];
				array[i] = temp;
				i = i-1;
			}
			System.out.println(Arrays.toString(array));
		}
		System.out.println(Arrays.toString(array));
	}

}
