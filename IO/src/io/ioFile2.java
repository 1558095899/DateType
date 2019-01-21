package io;
import java.io.File;
import java.io.IOException;

public class ioFile2 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\ab\\12.java");
		System.out.println(f.exists());//判断12.java是否存在
		
		File f1=new File("C:\\ab\\12\\34");
	
		System.out.println(f1.mkdirs());//创建多级目录，返回false or true
		String[] s=f1.list();//获取f1目录下所有文件名
		for(String s1:s) {
			System.out.println(s1);
		}
		File[] f2=f1.listFiles();//获取f1目录及所有文件名
		for(File f3:f2) {
			System.out.println(f3);
		}
		
	}

}
