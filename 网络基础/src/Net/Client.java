//TCPЭ��
package Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
//�ͻ���
public class Client {
	public static void main(String[] args) throws Exception {
		//����ip 127.0.0.1   �˿ڣ�8888
		Socket client=new Socket("127.0.0.1",8888);
		
		//���ܷ���˵���Ϣ
		//ʹ��Scannerɨ������ȡ����
		/*
		Scanner s=new Scanner(client.getInputStream());
		while(s.hasNextLine()) {
			String ss=s.nextLine();
			System.out.println(ss);
			s.close();
		}*/
		//ʹ��BufferedReader��װ����ȡ����
		BufferedReader b=new BufferedReader(new InputStreamReader
				(client.getInputStream()));
		String ss=b.readLine();
		System.out.println(ss);
		
		//�����˷�����Ϣ
		PrintStream p=new PrintStream(client.getOutputStream());
		p.println("�ͻ�����Ϣ");
		
		//�ر�
		p.close();
		b.close();
		client.close();
	}
}
