//ʵ�ֿ����л�
package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable{
	
	
	private static final long serialVersion=1L ;//�����汾

	//���л�
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileOutputStream f=new FileOutputStream("new.txt");
		ObjectOutputStream ob=new ObjectOutputStream(f);
		Person p=new Person("С��",18);//����name��age
		ob.writeObject(p);//д��ob
		ob.close();
		
		//�����л�
		
	try(FileInputStream ff=new FileInputStream("new.txt");
			ObjectInputStream oo=new ObjectInputStream(ff)){
		Person pe = (Person) oo.readObject();//��ȡ��������ΪPerson
		System.out.println(pe.getName()+pe.getAge());//��ȡname��age
	}catch(IOException e) {
		e.printStackTrace();
		}
	
	
	}
}
