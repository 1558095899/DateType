//标准输入输出
package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class SystemOutInDemo {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("new.txt"));//重定向标准输入流
		System.setOut(new PrintStream("nnn.txt"));//重定向标准输出流
		System.out.println("begin-----");
		int date=System.in.read();
		System.out.println(date);
		System.out.println("ending-----");
	}
}
