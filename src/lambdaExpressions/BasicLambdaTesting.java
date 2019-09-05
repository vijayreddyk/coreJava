package lambdaExpressions;
interface Shape<T, E>{
	T draw(E str);
}
public class BasicLambdaTesting {
	
	public static void main(String[] args) {
		Shape<String,String> s = (str)->{
			return str+" changed";
		};
		Shape<Integer,Integer> is = (var)->{
			return var*2;
		};
		System.out.println(s.draw("triangle"));
		System.out.println(is.draw(100));
	}

}
