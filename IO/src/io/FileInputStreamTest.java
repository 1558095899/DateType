package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class FileInputStreamTest {
	public static void main(String[] args) throws IOException{
		File f=new File("D:\\Eclipse\\IO\\ff.txt");
		FileInputStream in=new FileInputStream(f);
		byte[] b=new byte[1024];
		int hasRead=0;
		while((hasRead=in.read(b))>0) {
			System.out.println(new String(b,0,hasRead));
		}
		in.close();
	}
}
