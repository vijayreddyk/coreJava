package files;

public class Singleton {
	private static final Singleton singleton = null;
	private Singleton() {
		synchronized(singleton) {
			
		}
	}
	public Singleton getInstance() {
		return this.singleton;
	}
}
