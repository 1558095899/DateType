package io;
import java.io.File;
import java.io.IOException;

public class ioFile2 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\ab\\12.java");
		System.out.println(f.exists());//�ж�12.java�Ƿ����
		
		File f1=new File("C:\\ab\\12\\34");
	
		System.out.println(f1.mkdirs());//�����༶Ŀ¼������false or true
		String[] s=f1.list();//��ȡf1Ŀ¼�������ļ���
		for(String s1:s) {
			System.out.println(s1);
		}
		File[] f2=f1.listFiles();//��ȡf1Ŀ¼�������ļ���
		for(File f3:f2) {
			System.out.println(f3);
		}
		
	}

}
