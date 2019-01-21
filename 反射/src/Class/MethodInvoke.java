//ͨ�������ȡ���� �����÷���
package Class;

import java.lang.reflect.Method;

class Dog{
	public void dowork() {
		System.out.println("Dog.dowork()");
	}
	public void dowork(String s) {
		System.out.println("Dog.dowork()"+","+s);
	}
	private void dowork(String s,int i) {
		System.out.println("Dog.dowork()"+s+","+i);
	}
	public static void dowork(int i) {
		System.out.println("Dog.dowork()"+i);
	}
}

public class MethodInvoke {
	public static void main(String[] args) throws Exception{
		//��ȡClass����
		Class clazz=Dog.class;
		//��ȡ�޲�������
		Method method=clazz.getMethod("dowork");
		//ͨ����������޲�������
		method.invoke(clazz.newInstance());
		
		//��ȡString��������
		 method=clazz.getMethod("dowork", String.class);
		 //����String��������
		 method.invoke(clazz.newInstance(), "will");
		 
		 //��ȡ��˽�л��ķ��� ������
		 method=clazz.getDeclaredMethod("dowork", String.class,int.class);
		 //ȡ������Ȩ�޼��
		 method.setAccessible(true);
		 Object o=method.invoke(clazz.newInstance(), "will",18);
		 System.out.println(o);//null
		 
		 //ʹ�÷�����þ�̬����
		 method= clazz.getDeclaredMethod("dowork", int.class);
		 //����Ķ�������Ϊnull
		 method.invoke(null, 22);
	}
}
