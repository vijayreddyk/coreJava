package interfaces;

public interface Engine {
	public String name();
	public String type();
	public String piston();
	public String pistonRings();
	default int engineMethod() {
		return 0;
	}
	static int engineStaticMethod() {
		return 1;
	}
}
