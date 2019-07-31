package files;

public class CheckIfMagicNum {

	public static void main(String[] args) {
		int num = 11345144;
		System.out.println(checkIfMagicNum(num));
	}

	private static boolean checkIfMagicNum(int num) {
		if(num == 1) {
			return true;
		} else if(num == 0 || (num>=2 && num<=9)) {
			return false;
		} else {
			int sum = 0;
			while(num>0) {
				sum = sum+num%10;
				num = num/10;
			}
			return checkIfMagicNum(sum);
		}
	}

}
