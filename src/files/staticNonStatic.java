package files;

class staticNonStatic {
	static int i=2;
	private int classVar1;
	private int classVar2;
	
	public int nonStaticMethod(int num) {
		int a = nonStaticMethod2(num);
		return a;
	}
	public static int staticMethod(int num) {
		staticNonStatic sns = new staticNonStatic();
		num = sns.nonStaticMethod(2);
		return num*num;
	}
	public int nonStaticMethod2(int num) {
		return num*num*num;
	}
	public void increment() {
		i++;
	}
	public static void main(String[] args) {
		staticNonStatic sns1 = new staticNonStatic();
		sns1.increment();
		staticNonStatic sns2 = new staticNonStatic();
		sns2.increment();
		System.out.println(sns2.i);
	}
}

