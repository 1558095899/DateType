//ͨ�����䴴������
package Class;

import java.lang.reflect.Constructor;

class Uer{
	public Uer(){
		System.out.println("�޲���������");
	}
	public Uer(String name) {
		System.out.println("�в�����������"+name);
	}
	private Uer(String name,int i) {
		System.out.println("���֣�"+name+"���䣺"+i);
	}
}

//ͨ������ ��ȡ������ �� ��������
public class CreateObject {
	public static void main(String[] args) throws Exception{
		//��ȡ��Ӧ��Class����
		Class<Uer> clazz=Uer.class;
		//����һ     ���ڹ����޲����Ĺ���������ֱ�Ӵ�������
		clazz.newInstance();//�޲���������
		
		//������    ��ȡ���ڹ�����
		
		Constructor con=clazz.getConstructor(String.class);
		//ͨ����������������
		con.newInstance("will");
		System.out.println("---------------");
		//��ȡ�޲�������������������
		Constructor con1=clazz.getConstructor();
		con1.newInstance();
		
		//����˽�л���private�������� ����������
		Constructor con2=clazz.getDeclaredConstructor(String.class,int.class);
		//ȡ������Ȩ�޼��
		con2.setAccessible(true);
		con2.newInstance("will",18);
	}
}
