package files;

import java.util.ArrayDeque;
import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		pushElements(deque);
		pushElements(stack);
		popElement(stack);
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		System.out.println("Double ended queue is "+deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Double ended queue is "+deque);
	}

	private static void pushElements(ArrayDeque<Integer> deque) {
		for(int i=1;i<=50;i++) {
			deque.addLast(i);
			deque.addFirst(i);
		}
	}

	private static void popElement(Stack<Integer> stack) {
		stack.pop();
	}

	private static void pushElements(Stack<Integer> stack) {
		for(int i=1;i<=100;i++) {
			stack.push(i);
		}
	}

}
