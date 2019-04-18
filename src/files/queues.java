package files;

import java.util.LinkedList;
import java.util.Queue;

public class queues {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		addElementsToQueue(q);
		System.out.println("queue is "+q);
		System.out.println("poll of the queue is "+q.poll());
		System.out.println("peek of the queue is "+q.peek());
		System.out.println("size of the queue is "+q.size());
		System.out.println("top of the queue and removed element is "+q.remove());
		System.out.println("queue is "+q);
	}

	private static void addElementsToQueue(Queue<Integer> q) {
		for(int i = 1 ; i <= 10 ; i++ ) {
			q.add(i);
		}
	}

}
