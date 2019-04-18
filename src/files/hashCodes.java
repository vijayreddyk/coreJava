package files;
class test{
	int a;
	int b;
	public test(int a,int b) {
		this.a = a;
		this.b = b;
	}
	int abstarctMethod() {
		return 0;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
public class hashCodes {

	public static void main(String[] args) {
		test a = new test(1,2);
		test b = new test(1,2);
		System.out.println(a.hashCode()+"  "+b.hashCode());
		if(a.equals(b)) {
			System.out.println("Both objects are equal");
		}
		if(a.hashCode()==b.hashCode()) {
			System.out.println("Hash codes are equal");
		} else {
			System.out.println("Hash codes are not equal");
		}
	}

}
