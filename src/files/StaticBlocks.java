package files;

public class StaticBlocks {
	static int a = 2;
	static {
		System.out.println(++a);
		System.out.println(a);
		System.out.println("%%%%%%%%%%%%%%%%");
	}
	public static void main(String[] args) {
		System.out.println("bbbbbbbbbbbbbbbbb");
	}

}
