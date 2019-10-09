package threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ConcurrentModificationException extends Thread {
	static Vector<Integer> li = new Vector<>();
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized(li) {
			li.add(100);
			System.out.println(li);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<=10;i++) {
			li.add(i);
		}
		ConcurrentModificationException cme = new ConcurrentModificationException();
		cme.start();
		synchronized(li) {
			Iterator<Integer> itr = li.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				Thread.sleep(1000);
			}
		}
	}

}
