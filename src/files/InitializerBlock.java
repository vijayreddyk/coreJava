package files;

public class InitializerBlock {
	static Integer a=new Integer(-1);
	/*{
		a=14;
	}*/
	public InitializerBlock() {
		a++;
	}
	public static void main(String[] args) {
		InitializerBlock ib1 = new InitializerBlock();
		System.out.println(a);
		InitializerBlock ib2 = new InitializerBlock();
		System.out.println(a);
		
		String aa = ""; 
	}

}
