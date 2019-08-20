package generics;
class Generic1<E,V>{
	E var1;
	V var2;
	public Generic1(E e,V v) {
		this.var1 = e;
		this.var2 = v;
	}
}
public class GenericExample1 {

	public static void main(String[] args) {
		Generic1<Integer,String> g = new Generic1<Integer, String>(5, "hello");
		System.out.println(g.var1+"  "+g.var2);
		Generic1<Character,String> g1 = new Generic1<Character, String>('K', "hello2");
		System.out.println(g1.var1+"  "+g1.var2);
	}

}
