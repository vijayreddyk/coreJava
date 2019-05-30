package datastructures;

public class MatrixRowsWithNoOfOnes {
	public static final int matrix[][] = {{0,0,1,1},{1,1,0,0},{0,1,0,1},{1,1,1,0}};
	public static void main(String[] args) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int max = 0;
		int rowWithMaxZeros = 0;
		for(int rowIndex=0;rowIndex<rows;rowIndex++) {
			int numOfOnesEachRow = 0;
			for(int colIndex=0;colIndex<cols;colIndex++) {
				if(matrix[rowIndex][colIndex]==1) {
					numOfOnesEachRow++;
				}
			}
			if(max<numOfOnesEachRow) {
				max = numOfOnesEachRow;
				rowWithMaxZeros = rowIndex+1;
			}
		}
		System.out.println(rowWithMaxZeros);
	}

}
