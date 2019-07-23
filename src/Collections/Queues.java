package Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		ArrayDeque<String> dequeue = new ArrayDeque<>();
		PriorityQueue<String> priorityQueue = new PriorityQueue<>();
		performOpsOnPriorityQueue(priorityQueue);
	}

	private static void performOpsOnPriorityQueue(PriorityQueue<String> priorityQueue) {
		for(int i=0;i<100;i++) {
			priorityQueue.add(String.valueOf(i+1));
		}
	}

}
