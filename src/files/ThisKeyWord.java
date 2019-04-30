package files;

class ThisUseClass{
	int a;
	int b;
	int c;
	public ThisUseClass(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int volume(int a) {
		return this.a*b*c;
	}
}
public class ThisKeyWord {

	public static void main(String[] args) {
		ThisUseClass tuc = new ThisUseClass(2, 3, 4);
		System.out.println(tuc.volume(1));
	}

}
