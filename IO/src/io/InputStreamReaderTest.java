//获取键盘输入
package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		try(InputStreamReader i=new InputStreamReader(System.in);
			BufferedReader b=new BufferedReader(i)){
			String buffer=null;
			//循环读取多行
			while((buffer=b.readLine())!=null){
				
				System.out.println(buffer);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
