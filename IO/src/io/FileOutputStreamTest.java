package io;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest{
	public static void main(String[] args)  throws IOException{
		//����������
		FileInputStream f1=new FileInputStream("FileInputStreamTest.java");
		//���������������newfile��txt �ļ�
		File ff=new File("C:\\ab\\newFile.txt");
		FileOutputStream f2=new FileOutputStream(ff);
		byte[] b=new byte[32];//����b����
		int hasRead=0;
		while((hasRead=f1.read(b))>0) {
			f2.write(b,0,hasRead);//д���ļ������
		}
		File f3=new File("D:\\Eclipse\\IO\\IO\\new.txt");
		FileOutputStream f4=new FileOutputStream(f3);
		f4.write(89);
		f4.write("abcd".getBytes());
		FileInputStream f5=new FileInputStream("D:\\Eclipse\\IO\\IO\\new.txt");
		byte[] b1=new byte[1024];
		int bp=f5.read(b1);//��ȡ�ļ�����
		
		System.out.println(bp);
		String s=new String(b1,0,5);
		System.out.println(s);
		f5.close();
		f4.close();
		f2.close();
	}
}
