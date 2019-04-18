package files;

public class threeDimArray {

	public static void main(String[] args) {
		String array[][][] = new String[5][10][15];
		fillArray(array);
	}

	private static void fillArray(String[][][] array) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				for(int k=0;k<10;k++) {
					array[i][j][k] = i+""+j+""+k;
					System.out.print(array[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
