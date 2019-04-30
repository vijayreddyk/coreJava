package IOPackage;

import java.io.File;

public class FileCommands {

	public static void main(String[] args) {
		File file = new File("/home/vijay/workspace1/files/src/IOPackage/RansomText.txt");
		try {
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(file.getParentFile());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.exists());
			System.out.println(file.isAbsolute());
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
