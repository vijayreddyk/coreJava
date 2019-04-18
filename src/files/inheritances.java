package files;
class superClass1{
	private int superClassVar1;
	private int superClassVar2;
	public superClass1(){
		
	}
	public superClass1(int a,int b) {
		this.superClassVar1 = a;
		this.superClassVar2 = b;
	}
    @Override
    public String toString() {
    	return "|| superclass || "+this.superClassVar1+" || "+this.superClassVar2+" ||";
    }		
}
class subClass extends superClass1{
	private int subVar1;
	private int subVar2;
	public subClass() {
		super();
	}
	public subClass(int a,int b) {
		this.subVar1 = a;
		this.subVar2 = b;
	}
	@Override
	public String toString() {
		return "|| subclass || "+this.subVar1+" || "+this.subVar2+" ||";
	}
	public String subClassMethod() {
		return "|| inside subclass method ||";
	}
}
class subsubClass extends subClass{
	private int subsubclassVar1;
	private int subsubclassVar2;
	public subsubClass() {
		
	}
	public subsubClass(int a,int b) {
		super(a,b);
	}
	public String toString() {
		return "|| subsubclass || "+this.subsubclassVar1+" || "+this.subsubclassVar2+" ||";
	}
	//overloaded method
	public String subClassMethod() {
		return "|| inside overloaded method ||";
	}
	public String subsubClassMethod() {
		return "|| inside subsubclass method ||";
	}
}
class inheritances {

	public static void main(String[] args) {
		superClass1 sc1 = new superClass1(1, 3);
		superClass1 sc2 = new subClass(4, 6);
		subClass sc3 = new subClass(10, 20);
		subsubClass sc4 = new subsubClass(30, 40);
		superClass1 sc5 = new subsubClass(60, 70);
		/*System.out.println(sc1.toString());
		System.out.println(sc2.toString());
		System.out.println(sc3.subClassMethod());
		System.out.println(sc4.subClassMethod());
		*/
		System.out.println(sc5.toString());
	}

}
