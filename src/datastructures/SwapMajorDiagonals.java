package datastructures;

public class SwapMajorDiagonals {

	public static void main(String[] args) {
		int arr2[][] = {{1,1,1,1},{1,2,1,1},{1,1,2,3},{1,2,2,2}};
		printMatrix(arr2);
		SwapMajordiagonals(arr2);
		System.out.println();
		printMatrix(arr2);
	}
	private static void SwapMajordiagonals(int[][] arr2) {
		int start = 0;
		int end = arr2[0].length-1;
		for(int rowIndex = 0;rowIndex<arr2.length;rowIndex++) {
			int temp = arr2[rowIndex][start];
			arr2[rowIndex][start] = arr2[rowIndex][end];
			arr2[rowIndex][end] = temp;
			start++;
			end--;
		}
	}
	private static void printMatrix(int[][] arr3) {
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[0].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
