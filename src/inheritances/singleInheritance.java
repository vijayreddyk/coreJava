package inheritances;
class Shape{
	int dim1,dim2;
	public Shape(int dim1,int dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public void someMethod() {
		System.out.println("In super class method "+this.dim1+" "+this.dim2);
	}
	public int volume() {
		System.out.println("In volume method shape class");
		return (this.dim1*this.dim2);
	}
}
class Box extends Shape{
	int dim3;
	public Box(int dim1,int dim2,int dim3) {
		super(dim1,dim2);
		this.dim3 = dim3;
	}
	/*public int volume() {
		System.out.println("In volume method of Box class "+this.dim1+" "+this.dim2+" "+this.dim3);
		return (this.dim1*this.dim2*this.dim3);
	}*/
	public void someMethod() {
		super.someMethod();
		System.out.println("In sub class method");
	}
}
public class singleInheritance {
	public static void main(String[] args) {
		Box b1 = new Box(1,2,4);
		System.out.println(b1.volume());
		b1.someMethod();
	}
}
