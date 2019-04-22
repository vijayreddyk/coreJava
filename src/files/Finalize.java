package files;

class FinalizeExample {
	int var1;
	public FinalizeExample(int var) {
		this.var1 = var;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("in method finalize in FinalizeExample class");
	}
}

public class Finalize {

	public static void main(String[] args) {
		FinalizeExample s = new FinalizeExample(10);
		try {
			s.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println(s.var1);
		s = null;
		System.gc();
		//System.out.println(s.var1);
		System.out.println("Exiting main method...");
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("in method finalize in Finalize class");
	}
}
