package inheritances;
class Box2 extends Box{
	int dim4;
	public Box2(int dim1,int dim2,int dim3,int dim4) {
		super(dim1,dim2,dim3);
		this.dim4 = dim4;
	}
}
public class MultiLevelInheritance{

	public static void main(String[] args) {
		Shape s1 = new Box2(1,2,3,4);
		System.out.println(s1.volume());

	}

}
