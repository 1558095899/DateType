//	TCPЭ��
package Net;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintStream;

//�����
public class Server {
	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(8888);
		System.out.println("������׼������-------");
		//�������ӿͻ��˶���
		//ÿ�����ܽ���һ���ͻ��˵�Socket������ʱ���������ͻ����һ��Socket
		Socket client=server.accept();
		System.out.println("���ӵĿͻ��ˣ�"+client.getInetAddress());
		
		//������������Ϣ���ͻ���
		PrintStream p=new PrintStream(client.getOutputStream());
		p.println("��������Ϣ");
		
		//���ܿͻ��˷��͵���Ϣ
		Scanner s=new Scanner(client.getInputStream());
		while(s.hasNextLine()) {
			String ss=s.nextLine();
			System.out.println(ss);
		}
		
		//�رշ���
		s.close();
		client.close();
		server.close();
		p.close();
	}
}
