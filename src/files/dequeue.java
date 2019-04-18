package files;

import java.util.Deque;
import java.util.LinkedList;

public class dequeue {

	public static void main(String[] args) {
		Deque<Integer> doubleended_queue = new LinkedList<Integer>();
		addElementstoDequeue(doubleended_queue);
		System.out.println(doubleended_queue);
	}

	private static void addElementstoDequeue(Deque<Integer> doubleended_queue) {
		for(int i=1,j=10;i<=10;i++,j--) {
			doubleended_queue.addFirst(i);
			doubleended_queue.addLast(i);
			System.out.println(doubleended_queue.toString().substring(1,doubleended_queue.toString().length()-1));
		}
	}

}
