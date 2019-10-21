package inheritances;
class AB {
	public int a;
	protected int protVar;
	int defVar = 8;
	public AB() {
		a++;
		System.out.println("AB "+a);
	}
	public AB(int b) {
		a += b; 
	}
}
class BC extends AB {
	int a;
	public BC(int b) {
		super(b);
		System.out.println("BC "+a);
	}
}
public class RuntimePolymorphism {

	public static void main(String[] args) {
		AB abc1 = new BC(4);
		System.out.println();
		BC abc2 = new BC(5);
		System.out.println(abc2.protVar);
		System.out.println(abc2.defVar);
		AB abc3 = new AB(6);
	}

}
