package designpatterns;
class SingleTonObj{
	public static int counter = 0;
	private static SingleTonObj sto = null;
	private SingleTonObj() {
		
	}
	public static SingleTonObj getSingTonObj(){
		sto = new SingleTonObj();
		return sto;
	}
}
public class SingleTonDemo {

	public static void main(String[] args) {
		SingleTonObj sobj = SingleTonObj.getSingTonObj();
		System.out.println(sobj.counter);
		SingleTonObj sobj1 = SingleTonObj.getSingTonObj();
		System.out.println(sobj1.counter);
	}

}
