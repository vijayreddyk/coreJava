package interfaces;

public class InterfacesMain {

	public static void main(String[] args) {
		Hyundai hd = new Hyundai();
		System.out.println(hd.engineMethod());
		System.out.println(Vehicle.engineStaticMethod());

	}

}
