package files;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

public class bufferarrayinputsream {

	public static void main(String[] args) {
		byte array[] = {'h','r','f','t','e','f'};
		ByteArrayInputStream bi = new ByteArrayInputStream(array);
		while(bi.available()>0) {
			char temp = (char) bi.read();
			if(temp == 't')
				bi.mark(0);
			System.out.println(temp+" "+bi.available());
		}
		bi.reset();
		System.out.println();
		while(bi.available()>0) {
			char temp = (char) bi.read();
			System.out.println(temp+" "+bi.available());
		}
	}

}
