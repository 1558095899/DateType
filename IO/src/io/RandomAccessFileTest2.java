package io;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile r=new RandomAccessFile("new.txt","rw");//�Զ�д��ʽ
		r.seek(r.length());//ָ���¼��λ���ļ���ĩβ
		r.write("��ӵ�����".getBytes());
		r.close();
	}
}
