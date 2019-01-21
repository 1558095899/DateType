//实现可序列化
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable{
	
	
	private static final long serialVersion=1L ;//表明版本

	//序列化
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream f=new FileOutputStream("new.txt");
		ObjectOutputStream ob=new ObjectOutputStream(f);
		Person p=new Person("小明",18);//设置name，age
		ob.writeObject(p);//写入ob
		ob.close();
		
		//反序列化
		
	try(FileInputStream ff=new FileInputStream("new.txt");
			ObjectInputStream oo=new ObjectInputStream(ff)){
		Person pe = (Person) oo.readObject();//读取对象，类型为Person
		System.out.println(pe.getName()+pe.getAge());//获取name，age
	}catch(IOException e) {
		e.printStackTrace();
		}
	
	
	}
}
