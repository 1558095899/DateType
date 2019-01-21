//访问属性值 并修改
package Class;

import java.lang.reflect.Field;

class Person{
	private int age;
	private String name;
	public String toString() {
		return "name:"+name+"\n"+"age:"+age;
	}
}

public class VisitField {

	public static void main(String[] args) throws Exception {
		//创建Person对象
		Person p=new Person();
		//获取对应的Class对象
		Class<Person> clazz=Person.class;
		//获取Field值 并赋值
			Field field=clazz.getDeclaredField("age");
			//设置通过反射访问Field时取消访问权限检查
			field.setAccessible(true);
			//赋值
			field.setInt(p, 18);
		//获取Field值 并赋值
			Field fie=clazz.getDeclaredField("name");
			//设置通过反射访问Field时取消访问权限检查
			fie.setAccessible(true);
			//赋值
			fie.set(p, "小羊");
			System.out.println(p);
		
	}

}
