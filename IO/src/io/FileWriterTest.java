package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException{
		File ff=new File("C:\\ab\\12\\outfile.txt");//��...Ŀ¼�´���
		
		//������������д��
		FileWriter f2=new FileWriter(ff);
		f2.write("JAVASE\t"); //  \t��ʾ�ո�
		f2.write("JAVAEE\r\n");//  \r\n ��ʾWindousƽ̨����
		f2.write("JAVAWE");
		//�ر������
		f2.close();  
		
	}
	
}
