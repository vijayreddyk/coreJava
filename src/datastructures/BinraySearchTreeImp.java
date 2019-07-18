package datastructures;
class BTNode{
	int data;
	BTNode leftNode;
	BTNode rightNode;
	public BTNode(int data,BTNode leftNode,BTNode rightNode) {
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
}
class BinarySearchTree{
	BTNode root;
	public void insert(int data) {
		if(root == null) {
			root = new BTNode(data, null, null);
		} else {
			BTNode temp = root;
			BTNode nodeToInsert = null;
			while(temp!=null) {
				nodeToInsert = temp;
				if(temp.data<data) {
					temp = temp.rightNode;
				} else if(temp.data>data){
					temp = temp.leftNode;
				}
			}
			temp = new BTNode(data,null,null);
			System.out.println(root.rightNode);
			traverseElement(data);
		}
	}
	public void traverseElement(int data1) {
		BTNode temp = root;
		while(temp!=null && temp.data!=data1) {
			System.out.print(temp.data+"-->");
			if(temp.data<data1) {
				temp = temp.rightNode;
			} else if(temp.data>data1) {
				temp = temp.leftNode;
			}
		}
		System.out.println();
	}
}
public class BinraySearchTreeImp {
	public static void main(String[] args) {
		BinarySearchTree btree = new BinarySearchTree();
		btree.insert(6);
		btree.insert(100);
		btree.insert(5);
		btree.insert(8);
		btree.traverseElement(8);
	}
	
}
