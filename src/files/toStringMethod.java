package files;

public class toStringMethod {

	public static void main(String[] args) {
		toStringClass ts = new toStringClass("hello", "world");
		System.out.println(ts.toString());
	}

}
class toStringClass{
	private String var1;
	private String var2;
	public toStringClass(String var1,String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	@Override
	public String toString() {
		return this.var1+"=>"+this.var2;
	}
}