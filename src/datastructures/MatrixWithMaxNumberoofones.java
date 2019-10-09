package datastructures;

public class MatrixWithMaxNumberoofones {

	public static void main(String[] args) {
		int arr2[][] = {{1,1,1,1},{1,1,1,0},{10,1,0,0}};
		int max_one_rows = 0;
		int max_row = 0;
		for(int i=0;i<arr2.length;i++) {
			int curr_row_ones = 0;
			for(int j=0;j<arr2[0].length;j++) {
				if(arr2[i][j] == 1) {
					curr_row_ones++;
				}
			}
			if(max_one_rows<curr_row_ones) {
				max_one_rows = curr_row_ones;
				max_row = i;
			}
		}
		System.out.println(max_row);
	}

}
