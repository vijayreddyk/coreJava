package IOPackage;

import java.io.File;

public class ListOfFilesInDirectory {

	public static void main(String[] args) {
		File file = new File("/home/vijay/workspace1");
		if(file.isDirectory()) {
			File fileList[] = file.listFiles();
			for(File f:fileList) {
				if(f.isDirectory()) {
					System.out.println(f+" is a Directory");
				} else if(f.isFile()) {
					System.out.println(f+" is a File");
				}
			}
		} else {
			System.out.println(file+" is not a directory");
		}
	}

}
