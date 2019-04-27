package files;

class FinalExample{
	final int var;
	public FinalExample(int var) {
		this.var = var;
	}
	public int getVar() {
		return var;
	}
}
public class FinalVars {

	public static void main(String[] args) {
		FinalExample fe = new FinalExample(20);
		System.out.println(fe.getVar());
	}

}
