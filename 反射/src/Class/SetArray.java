//�������� ����ֵ
package Class;

import java.lang.reflect.Array;

public class SetArray {
	public static void main(String[] args) {
		//����������� ����ΪString ����Ϊ4
		Object arr=Array.newInstance(String.class, 4);
		//Ϊ��������ֵ
		Array.set(arr, 2, "������Ԫ��");
		Array.set(arr, 1, "�ڶ���Ԫ��");
		//��ʱ������for��������
		//��Array����get ����  ��ȡ
		Object o1=Array.get(arr, 1);
		System.out.println(o1);
		Object o2=Array.get(arr, 2);
		System.out.println(o2);
	}
}
