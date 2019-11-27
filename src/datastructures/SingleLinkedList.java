package datastructures;
class Node{
	private int data;
	private Node nextNode;
	public Node(int data,Node nextNode) {
		this.setData(data);
		this.setNextNode(nextNode);
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
class LinkedList{
	Node headNode;
	public void insert(int data) {
		if(headNode == null) {
			headNode = new Node(data,null);
		} else {
			Node newNode = new Node(data,headNode);
			headNode = newNode;
		}
	}
	public void insert(int data,int pos) {
		if(pos < 0) {
			System.out.println("Postion can not be less than 0");
		} else if(pos == 0) {
			if(headNode == null) {
				headNode = new Node(data,null);
			} else {
				Node newNode = new Node(data,headNode);
				headNode = newNode;
			}
		} else if(pos > 0){
			if(headNode == null) {
				System.out.println("positon is out of range");
			} else {
				Node positionNode = headNode;
				Node newNode = new Node(data,null);
				int index = 1;
				while(index != pos-1) {
					if(positionNode == null) {
						System.out.println("Position is out of range");
						break;
					} else {
						positionNode = positionNode.getNextNode();
						index++;
					}
				}
				if(index == pos-1) {
					newNode.setNextNode(positionNode.getNextNode());
					positionNode.setNextNode(newNode);
				}
			}
		}
	}
	public void delete() {
		if(headNode == null) {
			System.out.println("There are no elements in linked list");
		} else {
			headNode = headNode.getNextNode();
		}
	}
	public void delete(int pos) {
		if(pos < 0) {
			System.out.println("Postion can not be less than 0");
		} else if(pos == 0) {
			headNode = headNode.getNextNode();
		} else if(pos > 0) {
			if(headNode == null) {
				System.out.println("positon is out of range");
			} else {
				Node positionNode = headNode;
				int index = 1;
				while(index != pos-1) {
					if(positionNode == null) {
						System.out.println("Position is out of range");
						break;
					} else {
						positionNode = positionNode.getNextNode();
						index++;
					}
				}
				if(index == pos-1) {
					positionNode.setNextNode(positionNode.getNextNode().getNextNode());
				}
			}
		}
	}
	@Override
	public String toString() {
		Node positionNode = headNode;
		StringBuilder list = new StringBuilder();
		while(positionNode!=null) {
			list.append(positionNode.getData()+"=>");
			positionNode = positionNode.getNextNode();
		}
		list.append("null");
		return list.toString();
	}
}
public class SingleLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(2);
		System.out.println(list.toString());
		list.insert(5);
		System.out.println(list.toString());
		list.insert(7);
		System.out.println(list.toString());
		list.insert(3,2);
		System.out.println(list.toString());
		list.insert(-9,0);
		System.out.println(list.toString());
		list.insert(9,9);
		System.out.println(list.toString());
		list.insert(10,6);
		System.out.println(list.toString());
		list.delete();
		System.out.println(list.toString());
		list.delete(2);
		System.out.println(list.toString());
	}
}
