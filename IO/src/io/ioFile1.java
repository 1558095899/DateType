package io;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ioFile1 {
	public static void main(String[] args) throws IOException{
		String num="E:\\a\\b";
		String num2="E:/a/b";
		System.out.println(num);
		System.out.println(num2);
		File f1=new File("‪‪C:/abc/123.txt");
		File f2=new File("‪D:\\abc","123.java");
		File f3=new File("‪D:\\ab\\12.txt");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f3.exists());
		System.out.println(f1.exists());
		System.out.println(f1.getName());
		System.out.println(f1.getPath());
		System.out.println(new java.util.Date(f2.lastModified()).toLocaleString());
		Date date=new Date();
		System.out.println(date.toLocaleString());
		System.out.println(f2.exists());
		
		
	}
}
