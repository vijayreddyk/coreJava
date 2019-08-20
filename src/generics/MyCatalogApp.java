package generics;

import java.util.HashSet;
import java.util.Set;

public class MyCatalogApp<E extends superA> implements catCollection<E>{
	Set<E> catCollection = new HashSet<E>();
	@Override
	public void add(E e) {
		catCollection.add(e);
	}

	@Override
	public void display() {
		for(E e:catCollection) {
			System.out.println(e.toString());
		}
	}

}
