package threads;

final class SharedThreadClass{
	String str;
	public SharedThreadClass(String str) {
		this.str = str;
	}
	public String get() {
		return this.str;
	}
}
class Pro implements Runnable{
	SharedThreadClass stc;
	public Pro(SharedThreadClass stc) {
		this.stc = stc;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			stc.str = "|"+stc.str+"=Pro="+i+"|";
			System.out.println(stc.str);
		}
	}
	
}
class Con implements Runnable{
	SharedThreadClass stc;
	public Con(SharedThreadClass stc) {
		this.stc = stc;
	}
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			stc.str = "|"+stc.str+"=Con="+i+"|";
			System.out.println(stc.str);
		}
	}
}
public class ImmutableObjectsThreadSafeTest {
	public static void main(String[] args) throws InterruptedException {
		SharedThreadClass stc = new SharedThreadClass("hello");
		Thread p = new Thread(new Pro(stc));
		Thread c = new Thread(new Con(stc));
		p.start();
		c.start();
	}
}
