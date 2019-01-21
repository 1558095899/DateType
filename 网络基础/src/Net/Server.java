//	TCP协议
package Net;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

//服务端
public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(8888);
		System.out.println("服务器准备就绪-------");
		//接受连接客户端对象
		//每当接受接受一个客户端的Socket的请求时，服务器就会产生一个Socket
		Socket client=server.accept();
		System.out.println("连接的客户端："+client.getInetAddress());
		
		//服务器发送消息给客户端
		PrintStream p=new PrintStream(client.getOutputStream());
		p.println("服务器消息");
		
		//接受客户端发送的消息
		Scanner s=new Scanner(client.getInputStream());
		while(s.hasNextLine()) {
			String ss=s.nextLine();
			System.out.println(ss);
		}
		
		//关闭服务
		s.close();
		client.close();
		server.close();
		p.close();
	}
}
