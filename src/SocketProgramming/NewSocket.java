package SocketProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class NewSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {
		int c;
		Socket s = new Socket("whois.internic.net", 43);
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		String str = "MHProfessional.com";
		byte buf[] = str.getBytes();
		out.write(buf);
		// Read and display response.
		while ((c = in.read()) != -1) {
			System.out.println(c);
			System.out.print((char) c);
		}
		System.out.println(s);
		s.close();
	}

}
