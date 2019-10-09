package datastructures;

public class TransoposeOfMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 10, 10, 2, 0, 20, 4 }, 
				{ 1, 0, 0, 30, 2, 5 }, 
				{ 0, 10, 4, 0, 2, 0 }, 
				{ 1, 0, 2, 20, 0, 4 } 
		}; 
		printMatrix(mat);
		int transpose[][] = Transpose(mat);
		System.out.println();
		printMatrix(transpose);
	}
	private static int[][] Transpose(int[][] mat) {
		int transpose[][] = new int[mat[0].length][mat.length];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				transpose[j][i] = mat[i][j];
			}
		}
		return transpose;
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
