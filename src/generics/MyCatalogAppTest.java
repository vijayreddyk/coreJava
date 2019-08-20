package generics;
class superA{
	int a;
	int b;
	int c;
	public superA(int a,int b,int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
class subB extends superA{
	int d;
	int e;
	public subB(int a,int b,int c,int d,int e) {
		super(a,b,c);
		this.d = d;
		this.e = e;
	}
	@Override
	public String toString() {
		return "{type=subB,d="+this.d+",e="+this.e+"}";
	}
	@Override
	public int hashCode() {
		return this.c;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(this.getClass()!=obj.getClass()) {
			return false;
		} else {
			subB ob = (subB) obj;
			return (this.a == ob.a) && (this.b == ob.b) && (this.e== ob.e);
		}
	}
}
class subC extends superA{
	int f;
	int g;
	public subC(int a,int b,int c,int f,int g) {
		super(a,b,c);
		this.f = f;
		this.g = g;
	}
	@Override
	public String toString() {
		return "{type=subC,f="+this.f+",g="+this.g+"}";
	}
	@Override
	public int hashCode() {
		return this.c;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} else if(this.getClass()!=obj.getClass()) {
			return false;
		} else {
			subC ob = (subC) obj;
			return (this.a == ob.a) && (this.b == ob.b) && (this.f== ob.f);
		}
	}
}
public class MyCatalogAppTest {

	public static void main(String[] args) {
		subB b = new subB(1,2,3,111,5);
		subB a = new subB(1,2,3,4,5);
		subC e = new subC(1,2,3,4,5);
		subC c = new subC(6,7,8,9,11);
		subC d = new subC(6,7,8,9,10);
		MyCatalogApp<superA> mca = new MyCatalogApp<>();
		mca.add(a);
		mca.add(b);
		mca.add(c);
		mca.add(d);
		mca.add(e);
		mca.display();
	}

}
