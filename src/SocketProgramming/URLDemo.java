package SocketProgramming;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://pocuat.magma.co.in:8443/magma/");
		System.out.println(url.getPort());
		System.out.println(url.getContent());
		System.out.println(url.getHost());
		System.out.println("Ext:" + url.toExternalForm());
	}
}
