//��������ֵ ���޸�
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
		//����Person����
		Person p=new Person();
		//��ȡ��Ӧ��Class����
		Class<Person> clazz=Person.class;
		//��ȡFieldֵ ����ֵ
			Field field=clazz.getDeclaredField("age");
			//����ͨ���������Fieldʱȡ������Ȩ�޼��
			field.setAccessible(true);
			//��ֵ
			field.setInt(p, 18);
		//��ȡFieldֵ ����ֵ
			Field fie=clazz.getDeclaredField("name");
			//����ͨ���������Fieldʱȡ������Ȩ�޼��
			fie.setAccessible(true);
			//��ֵ
			fie.set(p, "С��");
			System.out.println(p);
		
	}

}
