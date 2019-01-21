package io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException{
		File ff=new File("C:\\ab\\12\\outfile.txt");//在...目录下创建
		
		//创建输入流并写入
		FileWriter f2=new FileWriter(ff);
		f2.write("JAVASE\t"); //  \t表示空格
		f2.write("JAVAEE\r\n");//  \r\n 表示Windous平台换行
		f2.write("JAVAWE");
		//关闭输出流
		f2.close();  
		
	}
	
}
