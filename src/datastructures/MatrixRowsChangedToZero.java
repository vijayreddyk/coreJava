package datastructures;

public class MatrixRowsChangedToZero {

	public static void main(String[] args) {
		int array[][] = {{1,0,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,0}};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array[0].length;j++) {
				if(array[i][j] == 1) {
					for(int k = 0;k<array[0].length;k++) {
						if(array[i][k] == 0) {
							array[i][j] = 999;
							break;
						}
					}
					for(int l = 0;l<array.length;l++) {
						if(array[l][j] == 0) {
							array[i][j] = 999;
							break;
						}
					}
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				if(array[i][j] == 999) {
					array[i][j] = 0;
				}
				System.out.print(array[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
