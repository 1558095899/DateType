package io;
import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	Person(String name,int age){
		System.out.println("有参数的构造器");
		this.age=age;
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
}
