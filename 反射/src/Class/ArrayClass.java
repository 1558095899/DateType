//ͨ������ ��������
package Class;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 
 * @author 18877545427
 *
 */
class ArraysDemo{
	public static void dowork(int[] i) {
		System.out.println("int[] ���飺"+Arrays.toString(i));
	}
	private static void dowork(String... arr ) {
		System.out.println("String[] ���飺"+Arrays.toString(arr));
	}
	public void dowork(String s,int i) {
		System.out.println("String:"+s+","+"int:"+i);
	}
}

public class ArrayClass {
	public static void main(String[] args) throws Exception {
		//��ȡClass����
		Class clazz=ArraysDemo.class;
		//��ȡ����1  ���ڻ���������
		Method method=clazz.getDeclaredMethod("dowork", int[].class);
		//���þ�̬����  ��������Ϊint������ ��Ҫnewһ���µ�������󲢴���ֵ  �� ��
		method.invoke(null, new int[]{1,2,3});
		System.out.println("-------------------");
		
		//������   ������������ ��
		method=clazz.getDeclaredMethod("dowork", String[].class);
		//ȡ������Ȩ�޼��
		method.setAccessible(true);
		//method.invoke(null, new String[] {"a","b","c"});//  ���� wrong number of arguments
		//������������  ��ҪObject������ ��װ����
		method.invoke(null, new Object[] {new String[] {"a","b","c"}});
		
		//�Ǿ�̬����
		method=clazz.getMethod("dowork", String.class,int.class);
		method.invoke(clazz.newInstance(), new Object[]{"lucy",18});
		
	}
}
