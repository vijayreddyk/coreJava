package files;

public class returnCheck {

	public static void main(String[] args) {
		checkforReturn(5);

	}

	private static void checkforReturn(int i) {
		if(i==5)
			return;
		else
			i=i+2;
	}

}
