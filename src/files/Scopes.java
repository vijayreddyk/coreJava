package files;

public class Scopes {
	int x;
	char c;
	public static void main(String[] args) {
		{ 
            int x = 5;
            Scopes s = new Scopes();
            System.out.println(s.x);
            System.out.println(s.c);
        } 
	}

}
