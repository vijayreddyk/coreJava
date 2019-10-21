package dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		//System.out.println(fibonacci(1000));
		fibonacciUsingLoops(20);
	}

	private static void fibonacciUsingLoops(int num) {
		int num1 = 0;
		int num2 = 1;
		while(num1<=num) {
			System.out.println(num1);
			int a = num1+num2;
			num1 = num2;
			num2 = a;
		}
	}

	private static int fibonacci(int i) {
		if(i==1) {
			System.out.println(i);
			return 1;
		} else {
			int current_num = i+fibonacci(i-1);
			System.out.println(current_num);
			return current_num;
		}
	}

}
