package java8;

import java.util.ArrayList;
import java.util.List;
interface testinterface{
	public int methodA(int a,String b);
	static int methodB() {
		System.out.println("This is a static method");
		return 0;
	}
	default int methodC(int a,String b) {
		System.out.println("This is a default method");
		return 0;
	}
}
public class Lambdaexpressions{

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<=9;i++) {
			list.add(i+1);
		}
		list.forEach((i)->{System.out.println(i);});
		testinterface ti = (int x,String y)->{
			return Integer.parseInt(x+y);
		};
		System.out.println(ti.methodA(5, "6"));
		System.out.println(ti.methodC(4, "6"));
		System.out.println(testinterface.methodB());
	}

}
