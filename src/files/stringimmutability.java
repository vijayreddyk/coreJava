package files;

public class stringimmutability {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str+" "+str.hashCode());
		str = str.concat(str);
		System.out.println(str+" "+str.hashCode());
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		System.out.println(sb.toString()+" "+sb.hashCode());
		sb.append(sb);
		System.out.println(sb.hashCode()+" "+sb.toString());
	}

}
