//É¨Ãè
package io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class ScannerDemo {
	public static void main(String[] args) throws IOException{
		
		/*É¨ÃèÎÄ¼şÊäÈë
		Scanner s1=new Scanner(new File("D:\\Eclipse\\IO\\new.txt"));
		
		while(s1.hasNextLine()){
			String ss=s1.nextLine();
			System.out.println(ss);    */
		//É¨Ãè¼üÅÌÊäÈë
		Scanner s=new Scanner(System.in);
		while(s.hasNextLine()) {
			String ss=s.nextLine();
			System.out.println(ss);
			
		}

		}
	}

