package lambdaExpressions;
interface CheckLamdaExpressions{
	int checkLambbdaMethod(String var) throws NumberFormatException;
}
public class LambdaExpressionsAsArguments {
	
	public static void main(String[] args) {
		CheckLamdaExpressions cle = (v)->{
			return Integer.parseInt(v)*2;
		};
		try {
			System.out.println(cle.checkLambbdaMethod("1234r"));
		} catch (NumberFormatException ne) {
			System.out.println(cle.checkLambbdaMethod("100"));
		}
	}

}
