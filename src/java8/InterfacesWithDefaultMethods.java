package java8;
interface Vehicle{
	String model = "";
	int noOfWheels = 0;
	boolean manual = true;
	int tankCapacity = 0;
	static int noOfVehiclesSold = 0;
	default int noOfVehiclesSold1() {
		return noOfVehiclesSold;
	}
	static int noOfVehiclesSold() {
		return noOfVehiclesSold;
	}
}
interface Engine{
	int induction = 2;
	int injection = 3;
	int combustion = 4;
	default int capacityUtilization() {
		return capacity(induction-1,injection,combustion);
	}
	default int noOfVehiclesSold1() {
		return induction*injection*combustion;
	}
	int capacity(int induction, int injection, int combustion);
}
class ModelCar implements Vehicle,Engine{

	@Override
	public int capacity(int induction, int injection, int combustion) {
		return (induction*injection*combustion);
	}

	@Override
	public int noOfVehiclesSold1() {
		return Engine.super.noOfVehiclesSold1();
	}
	
}
public class InterfacesWithDefaultMethods {

	public static void main(String[] args) {
		ModelCar mc = new ModelCar();
		System.out.println(mc.noOfVehiclesSold1());
	}

}
