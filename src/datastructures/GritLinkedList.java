package datastructures;
import java.util.Stack;
public class GritLinkedList {
	Node head;
	public void insert(int data) {
		Node newNode = new Node(data, null);
		Node temp = null;
		if(head == null) {
			head = newNode;
		} else {
			temp = head;
			while(temp.getNextNode()!=null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(newNode);
		}
		newNode = null;
		temp = null;
	}
	
	private void printLinkedList() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.getData()+"=>");
			temp = temp.getNextNode();
		}
		System.out.print("null");
		System.out.println();
		temp = null;
	}
	
	private void reverseLinkedList() {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current!=null) {
			next = current.getNextNode();
			current.setNextNode(prev);
			prev = current;
			current = next;
		}
		head = prev;
		
		prev = null;
		current = null;
		next = null;
	}
	
	private void reverseLinkedListUsingStack() {
		Stack<Node> stack = new Stack<>();
		Node temp = head;
		while(temp!=null) {
			stack.push(temp);
			temp = temp.getNextNode();
		}
		head = stack.pop();
		temp = head;
		while(!stack.isEmpty()) {
			temp.setNextNode(stack.pop());
			temp = temp.getNextNode();
		}
		temp.setNextNode(null);
		temp = null;
		stack = null;
	}
	public static void main(String[] args) throws InterruptedException {
		GritLinkedList gl = new GritLinkedList();
		gl.insert(10);
		gl.printLinkedList();
		gl.insert(12);
		gl.printLinkedList();
		gl.insert(-999);
		gl.printLinkedList();
		gl.reverseLinkedList();
		gl.printLinkedList();
		gl.reverseLinkedListUsingStack();
		gl.printLinkedList();
		System.gc();
		Thread.sleep(10000);
		/*try {
			gl.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println("++++++++++++++");
		gl.printLinkedList();
	}
	@Override
	protected void finalize() throws Throwable {
		head = null;
	}
}
