package dynamicprogramming;

public class MultiplyTwoNumsWith {

	public static void main(String[] args) {
		int res = multiply(-100,-200);
		System.out.println(res);
	}

	private static int multiply(int i, int j) {
		if(i == 1) {
			return j;
		} else {
			return j+multiply(i-1,j);
		}
	}

}
