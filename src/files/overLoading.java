package files;
class superClass {
	private Integer var1;
	private Integer var2;
	private Double var3;
	private Double var4;
	private String var5;
	private String var6;
	
	public superClass() {
		
	}
	public superClass(Integer a,Integer b) {
		this.var1 = a;
		this.var2 = b;
	}
	public superClass(Double a,Double b) {
		this.var3 = a;
		this.var4 = b;
	}
	public superClass(String a,String b) {
		this.var5 = a;
		this.var6 = b;
	}
	public superClass(superClass sc) {
		System.out.println(sc.toString());
	}
	@Override
	public String toString() {
		return "|var1 = "+this.var1+"|var2 = "+this.var2+"|var3 = "+this.var3+"|var4 = "+this.var4+"|var5 = "+this.var5+"|var6 = "+this.var6+"|";
	}
}
public class overLoading {

	public static void main(String[] args) {
		superClass sc = new superClass(1.0,2.0);
		superClass sc1 = new superClass("1","2");
		superClass sc2 = new superClass(1,2);
		superClass sc3 = new superClass(sc);
		sc3 = new superClass(sc1);
		sc3 = new superClass(sc2);
	}

}
