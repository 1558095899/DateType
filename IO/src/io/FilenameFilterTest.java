//�ļ�������FilenameFilter
package io;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
	public static void main(String[] args) {
		File file=new File("D:\\11");
		File[] f=file.listFiles(new FilenameFilter() {
			public boolean accept(File d,String name) {
				return name.endsWith(".txt"); //��ȡD:\\11�µ�.txt�ļ�
			} 
		});
		for (File file2 : f) {
			System.out.println(file2);
		}
	}
}
