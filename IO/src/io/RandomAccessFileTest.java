//��������ļ�λ��
package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException{
		RandomAccessFile r=new RandomAccessFile("new.txt","r");//��ʽΪֻ��
		System.out.println(r.getFilePointer());//��ȡ��¼ָ���λ��
		System.out.println(r.length());//��ȡ�ļ�����
		r.seek(0);//������λ�ÿ�ʼΪ0�ַ���ʼ
		byte[] b=new byte[1024];
		int hasread=0;
		while((hasread=r.read(b))>0) {
			System.out.println(new String(b,0,hasread));
		}
		r.close();
	}
}
