package datastructures;
class DoubleLinkedNode{
	private int data;
	private DoubleLinkedNode next;
	private DoubleLinkedNode prev;
	public DoubleLinkedNode(int data,DoubleLinkedNode next,DoubleLinkedNode prev) {
		this.setData(data);
		this.setPrev(prev);
		this.setNext(next);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DoubleLinkedNode getNext() {
		return next;
	}
	public void setNext(DoubleLinkedNode next) {
		this.next = next;
	}
	public DoubleLinkedNode getPrev() {
		return prev;
	}
	public void setPrev(DoubleLinkedNode prev) {
		this.prev = prev;
	}
}
class DoubleLinkedList{
	DoubleLinkedNode begin;
	DoubleLinkedNode end;
	public void insertAtStart(int data) {
		if(begin == null) {
			DoubleLinkedNode newNode = new DoubleLinkedNode(data, null, null);
			begin = newNode;
			end = newNode;
		} else {
			DoubleLinkedNode newNode = new DoubleLinkedNode(data, null, null);
			newNode.setNext(begin);
			begin.setPrev(newNode);
			begin = newNode;
		}
	}
	public void insertAtEnd(int data) {
		if(end == null) {
			DoubleLinkedNode newNode = new DoubleLinkedNode(data, null, null);
			begin = newNode;
			end = newNode;
		} else {
			DoubleLinkedNode newNode = new DoubleLinkedNode(data, null, null);
			newNode.setPrev(end);
			end.setNext(newNode);
			end = newNode;
		}
	}
	public void insertAtPos(int data,int pos) {
		DoubleLinkedNode temp = begin;
		while(pos > 1 && temp!=null) {
			temp = temp.getNext();
			pos--;
		}
		DoubleLinkedNode nextNode = temp.getNext();
		DoubleLinkedNode newNode = new DoubleLinkedNode(data, null, null);
		temp.setNext(newNode);
		newNode.setPrev(temp);
		newNode.setNext(nextNode);
		nextNode.setPrev(newNode);
	}
	public void deleteAtEnd() {
		if(end == null) {
			System.out.println("List is Empty");
		} else {
			end = end.getPrev();
			end.setNext(null);
		}
	}
	public void deleteAtStart() {
		if(begin == null) {
			System.out.println("List is Empty");
		} else {
			begin = begin.getNext();
			begin.setPrev(null);
		}
	}
	public void reverseDoublyLinkedList() {
		DoubleLinkedNode prev = null;
		DoubleLinkedNode current = begin;
		DoubleLinkedNode next = null;
		while(current!=null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		begin = prev;
	}
	@Override
	public String toString() {
		DoubleLinkedNode positionNode = begin;
		StringBuilder list = new StringBuilder();
		list.append("null<-->");
		while(positionNode!=null) {
			list.append(positionNode.getData()+"<-->");
			positionNode = positionNode.getNext();
		}
		list.append("null");
		return list.toString();
	}
	
}
public class MyDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.insertAtEnd(1);
		list.insertAtStart(1);
		System.out.println(list.toString());
		list.insertAtEnd(2);
		list.insertAtStart(2);
		System.out.println(list.toString());
		list.insertAtEnd(3);
		list.insertAtStart(3);
		System.out.println(list.toString());
		list.insertAtEnd(4);
		list.insertAtStart(4);
		System.out.println(list.toString());
		list.deleteAtStart();
		System.out.println(list.toString());
		list.deleteAtEnd();
		System.out.println(list.toString());
		list.insertAtEnd(4);
		list.insertAtStart(4);
		list.insertAtEnd(5);
		list.insertAtStart(5);
		//list.insertAtPos(-1, 5);
		System.out.println(list.toString());
		list.reverseDoublyLinkedList();
		System.out.println(list.toString());
	}

}
