package generics;

class Generic2<T extends Number>{
	T array[];
	public Generic2(T a[]){
		this.array = a;
	}
	public void display() {
		for(T a:array) {
			System.out.println(a);
		}
	}
}
public class GenericExample2 {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5,6,7,8};
		Generic2<Integer> g2 = new Generic2<Integer>(intArray);
		g2.display();
		String stringArray[] = {"a","b","c","d","e"};
	}

}
