//任意访问文件位置
package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException{
		RandomAccessFile r=new RandomAccessFile("new.txt","r");//格式为只读
		System.out.println(r.getFilePointer());//获取记录指针的位置
		System.out.println(r.length());//获取文件长度
		r.seek(0);//搜索的位置开始为0字符开始
		byte[] b=new byte[1024];
		int hasread=0;
		while((hasread=r.read(b))>0) {
			System.out.println(new String(b,0,hasread));
		}
		r.close();
	}
}
