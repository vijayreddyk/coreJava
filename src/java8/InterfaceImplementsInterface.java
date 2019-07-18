package java8;
interface Page{
	int noOfPages(int pages);
	double quality(int qualityNum);
	static String someMethod() {
		return "In static private method in page class";
	}
}
interface Book extends Page{
	String bookName(String name);
	static String someMethod() {
		return "In static private method in book interface";	
	}
}
class NewBook implements Book{
	@Override
	public int noOfPages(int pages) {
		return pages*2;
	}

	@Override
	public double quality(int qualityNum) {
		return qualityNum*3;
	}

	@Override
	public String bookName(String name) {
		return null;
	}
}
public class InterfaceImplementsInterface {

	public static void main(String[] args) {
		NewBook nb = new NewBook();
		Page.someMethod();
	}

}
