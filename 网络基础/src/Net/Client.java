//TCP协议
package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//客户端
public class Client {
	public static void main(String[] args) throws Exception {
		//本机ip 127.0.0.1   端口：8888
		Socket client=new Socket("127.0.0.1",8888);
		
		//接受服务端的消息
		//使用Scanner扫描器获取输入
		/*
		Scanner s=new Scanner(client.getInputStream());
		while(s.hasNextLine()) {
			String ss=s.nextLine();
			System.out.println(ss);
			s.close();
		}*/
		//使用BufferedReader包装流获取输入
		BufferedReader b=new BufferedReader(new InputStreamReader
				(client.getInputStream()));
		String ss=b.readLine();
		System.out.println(ss);
		
		//向服务端发送消息
		PrintStream p=new PrintStream(client.getOutputStream());
		p.println("客户端消息");
		
		//关闭
		p.close();
		b.close();
		client.close();
	}
}
