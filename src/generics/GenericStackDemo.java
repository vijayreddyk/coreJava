package generics;
class GenericStackNode<T>{
	private T data;
	private GenericStackNode<T> next;
	public GenericStackNode(T data, GenericStackNode<T> next) {
		this.data = data;
		this.next = next;
	}
	public T getData() {
		return this.data;
	}
	public void setNext(GenericStackNode<T> next) {
		this.next = next;
	}
	public GenericStackNode<T> getNext() {
		return this.next;
	}
}
class GenericStack<T>{
	GenericStackNode<T> top;
	public void push(T data) {
		if(top == null) {
			top = new GenericStackNode<T>(data,null);
		} else {
			GenericStackNode<T> newNode = new GenericStackNode<>(data, null);
			newNode.setNext(top);
			top = newNode;
		}
	}
	public T pop() {
		GenericStackNode<T> temp = top;
		top = top.getNext();
		return temp.getData();
	}
	public T peek() {
		return top.getData();
	}
	@Override
	public String toString() {
		StringBuilder stackString = new StringBuilder();
		GenericStackNode<T> temp = top;
		while(temp.getNext()!=null) {
			stackString.append(temp.getData()+"\n");
			temp = temp.getNext();
		}
		stackString.append(temp.getData()+"\n");
		return stackString.toString();
	}
}
public class GenericStackDemo {

	public static void main(String[] args) {
		GenericStack<String> gs = new GenericStack<>();
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(4);
		intStack.push(9);
		gs.push("hello");
		System.out.println(gs.toString());
		gs.push("hi");
		System.out.println(gs.toString());
		gs.push("who");
		System.out.println(gs.toString());
		gs.push("what");
		gs.pop();
		System.out.println(gs.toString());
		System.out.println(intStack.toString());
	}

}
