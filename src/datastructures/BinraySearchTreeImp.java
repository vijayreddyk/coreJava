package datastructures;

import java.util.ArrayList;
import java.util.List;

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
			if(nodeToInsert.data > data) {
				nodeToInsert.leftNode = new BTNode(data, null, null);
			} else {
				nodeToInsert.rightNode = new BTNode(data, null, null);
			}
		}
	}
	public List<Integer> traverseElement(int data1) {
		BTNode temp = root;
		List<Integer> trackList = new ArrayList<Integer>();
		trackList.add(temp.data);
		while(temp!=null && temp.data!=data1) {
			if(temp.data<data1) {
				temp = temp.rightNode;
			} else if(temp.data>data1) {
				temp = temp.leftNode;
			}
			trackList.add(temp.data);
		}
		System.out.println(trackList);
		return trackList;
	}
	public int leastCommonParent(int num1,int num2) {
		List<Integer> traverseList1 = traverseElement(num1);
		List<Integer> traverseList2 = traverseElement(num2);
		if(traverseList1.size()>=traverseList2.size()) {
			for(int i=traverseList2.size()-2;i>=0;i--) {
				if(traverseList1.contains(traverseList2.get(i)) && traverseList2.get(i)!=num1) {
					return traverseList2.get(i);
				}
			}
		} else {
			for(int i=traverseList1.size()-2;i>=0;i--) {
				if(traverseList2.contains(traverseList1.get(i)) && traverseList1.get(i)!=num2) {
					return traverseList1.get(i);
				}
			}
		}
		System.out.println(traverseList1+" "+traverseList2);
		return 0;
	}
}
public class BinraySearchTreeImp {
	public static void main(String[] args) {
		BinarySearchTree btree = new BinarySearchTree();
		btree.insert(6);
		btree.insert(100);
		btree.insert(5);
		btree.insert(8);
		btree.insert(97);
		btree.insert(101);
		btree.insert(57);
		btree.insert(-999);
		btree.insert(-123);
		System.out.println(btree.leastCommonParent(97, 57));
		//btree.traverseElement(8);
	}
	
}
