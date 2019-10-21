package dynamicprogramming;

public class AllCombinationsOfSeven {

	public static void main(String[] args) {
		System.out.println(solveSum(7));
	}

	private static int solveSum(int i) {
		if(i<0) {
			return 0;
		} else if(i==1) {
			return 1;
		} else {
			return solveSum(i-1)+solveSum(i-3) +solveSum(i-5);
		}
	}

}
