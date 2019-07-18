package Strings;
class StringTestClass{
	String a;
	public String getA() {
		return this.a;
	}
}
public class StringsExp {

	public static void main(String[] args) {
		StringTestClass a = new StringTestClass();
		a.a="abc";
		StringTestClass b = new StringTestClass();
		b.a="abc";
		System.out.println(a.getA()==b.getA());
	}

}
