package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class bufferedinputstream {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		BufferedInputStream bim = null;
		BufferedOutputStream bos = null;
		try {
			is = new FileInputStream("src/files/sample.txt");
			os = new FileOutputStream("src/files/sample.txt");
			bos = new BufferedOutputStream(os);
			bim = new BufferedInputStream(is);
			while(bim.available()>0) {
				Integer i = bim.available();
				System.out.println("Available "+i);
				char c = (char) bim.read();
				bos.write(c);
				System.out.println("char "+c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
