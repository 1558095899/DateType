package io;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest{
	public static void main(String[] args)  throws IOException{
		//创建输入流
		FileInputStream f1=new FileInputStream("FileInputStreamTest.java");
		//创建输出流，生成newfile。txt 文件
		File ff=new File("C:\\ab\\newFile.txt");
		FileOutputStream f2=new FileOutputStream(ff);
		byte[] b=new byte[32];//创建b数组
		int hasRead=0;
		while((hasRead=f1.read(b))>0) {
			f2.write(b,0,hasRead);//写入文件输出流
		}
		File f3=new File("D:\\Eclipse\\IO\\IO\\new.txt");
		FileOutputStream f4=new FileOutputStream(f3);
		f4.write(89);
		f4.write("abcd".getBytes());
		FileInputStream f5=new FileInputStream("D:\\Eclipse\\IO\\IO\\new.txt");
		byte[] b1=new byte[1024];
		int bp=f5.read(b1);//读取文件内容
		
		System.out.println(bp);
		String s=new String(b1,0,5);
		System.out.println(s);
		f5.close();
		f4.close();
		f2.close();
	}
}
