package io;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile r=new RandomAccessFile("new.txt","rw");//以读写方式
		r.seek(r.length());//指针记录定位到文件的末尾
		r.write("添加的内容".getBytes());
		r.close();
	}
}
