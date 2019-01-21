package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.io.StringWriter;

public class PrintStreamTest {
	public static void main(String[] args) throws IOException{
		try(FileOutputStream f=new FileOutputStream("f.txt");
			PrintStream p=new PrintStream(f)	){
			p.println("JAVA");
			p.println(new PrintStreamTest());//打印对象
		}catch(IOException e){
			e.printStackTrace();
		}
		
		//字符输入
		String s="从明天开始"+"周游世界"+"随缘";
		StringReader r=new StringReader(s);
		char[] ch=new char[1024];
		int hasread=0;
		while((hasread=r.read(ch))>0) {
			System.out.println(new String(ch,0,hasread));
		}
		r.close();
		
		//字符输出
		StringWriter ss=new StringWriter();
		ss.write("有一个美丽的世界");
		System.out.println(ss);
		ss.close();
	}
}
