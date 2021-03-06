package datastructures;

class Stack{
	Node top;
	public void push(int data) {
		if(top == null) {
			top = new Node(data,null);
		} else {
			Node newNode = new Node(data,null);
			newNode.setNextNode(top);
			top = newNode;
		}
	}
	public int peek() {
		return top.getData();
	}
	public void pop() {
		if(top!=null) {
			top = top.getNextNode();
		}
	}
	/* Function to reverse the linked list */
    Node reverse() { 
        Node prev = null; 
        Node current = top; 
        Node next = null; 
        while (current != null) { 
            next = current.getNextNode(); 
            current.setNextNode(prev); 
            prev = current; 
            current = next;
            System.out.println("prev = "+prev.getData()+" current = "+current.getData()+" next = "+next.getData());
        } 
        top = prev; 
        return top; 
    }
    Node reverseStack() {
    	Node prev = null;
    	Node current = top;
    	Node next = null;
    	while(current!=null) {
    		next = current.getNextNode();
    		current.setNextNode(prev);
    		prev = current;
    		current = next;
    	}
    	top = prev;
    	return top;
    }
	@Override
	public String toString() {
		Node positionNode = top;
		StringBuilder list = new StringBuilder();
		while(positionNode!=null) {
			list.append("| "+positionNode.getData()+" |\n");
			positionNode = positionNode.getNextNode();
		}
		return list.toString();
	}
}
public class MyStack {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(3);
		//System.out.println(st.toString());
		st.push(6);
		//System.out.println(st.toString());
		st.push(9);
		//System.out.println(st.toString());
		st.push(12);
		//System.out.println(st.toString());
		//st.pop();
		System.out.println(st.toString());
		//System.out.println(st.peek());
		System.out.println(st.reverse());
		System.out.println(st.toString());
		st.pop();
		System.out.println(st.toString());
	}

}
