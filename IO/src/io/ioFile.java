package io;

import java.io.File;
import java.io.IOException;

public class ioFile {
	public static void main(String[] args) throws IOException {
		File file=new File(".");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		File f=File.createTempFile("wjj",".txt",file);
		f.deleteOnExit();
		System.out.println(f);
		File newfile=new File(System.currentTimeMillis()+"");
		System.out.println(newfile.exists());
		String[] s=file.list();
		for(String ss:s) {
			System.out.println(ss);//���io�ļ����µ������ļ���
		}
		File[] ff=File.listRoots();
		for(File root:ff) {
			System.out.println(root);//���ϵͳ���и�·��
		}
	}
}
