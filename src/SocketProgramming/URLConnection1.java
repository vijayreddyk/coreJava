package SocketProgramming;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection1 {

	public static void main(String[] args) throws IOException {
		URL url = new URL("https://pocuat.magma.co.in:8443/magma/userListController.htm");
		URLConnection conn = url.openConnection();
		System.out.println(conn.getContentLength());
		System.out.println(conn.getContentType());
		System.out.println(conn.getHeaderField(4));
	}

}
