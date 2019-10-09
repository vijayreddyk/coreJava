package datastructures;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int arr1[][] = {{1,1,1},{1,1,1},{1,1,1},{1,1,1}};
		int arr2[][] = {{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		int arr3[][] = new int[arr1.length][arr2[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				arr3[i][j] = 0;
				for(int k=0;k<arr1[0].length;k++) {
					arr3[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		printMatrix(arr3);
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
