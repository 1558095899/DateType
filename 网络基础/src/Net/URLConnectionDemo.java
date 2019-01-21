package Net;

import java.net.URL;

public class URLConnectionDemo {
	public static void main(String[] args) throws Exception{
		URL u=new URL("http","localhost",8080,"/index.jsp");
		System.out.println(u);
	}
}
