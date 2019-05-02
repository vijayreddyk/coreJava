package datastructures;
class Queue{
	Node back;
	Node front;
	public void enqueue(int data) {
		if(back == null) {
			back = new Node(data,null);
			front = back;
		} else {
			Node newNode = new Node(data,null);
			newNode.setNextNode(back);
			back = newNode;
		}
	}
	public void dequeue() {
		if(front == null) {
			
		} else {
			Node positionNode = back;
			while(positionNode.getNextNode()!=front) {
				positionNode = positionNode.getNextNode();
			}
			positionNode.setNextNode(null);
			front = positionNode;
		}
	}
	@Override
	public String toString() {
		Node positionNode = back;
		StringBuilder list = new StringBuilder();
		while(positionNode!=null) {
			list.append("| "+positionNode.getData()+" |");
			positionNode = positionNode.getNextNode();
		}
		return list.toString();
	}
}
public class MyQueue {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		System.out.println(q.toString());
		q.enqueue(2);
		System.out.println(q.toString());
		q.enqueue(3);
		System.out.println(q.toString());
		q.enqueue(4);
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());
		q.enqueue(5);
		System.out.println(q.toString());
		q.dequeue();
		System.out.println(q.toString());
	}

}
