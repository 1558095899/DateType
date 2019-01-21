package Class;

import java.lang.reflect.Constructor;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

@Deprecated

/**
 * 
 * 
 * @author 18877545427
 *
 */
public class ClassTest {
	
	//����private���εĹ�����
	private ClassTest(){
		System.out.println("private���ι�����");
	}
	//����public���εĹ�����
	public ClassTest(String s){
		
	}
	//
	public ClassTest(String s,int i) {
		
	}
	//����1
	public void info() {
		
	}
	//����2
	public void info(String s) {
		
	}
	//����3
	public void info(String s,int i) {
		
	}
	//Field
	public int i;
	public int n;
	//�ڲ���
	class in{
		
	}
	public static void main(String[] args) throws NoSuchMethodException, Exception {
		//��ȡClassTest���Ӧ��Class
		 Class<ClassTest> clazz=ClassTest.class;
		 System.out.println(clazz);
		 //��ȡ����
		String s=clazz.getName();
		System.out.println("��Ӧ����Ϊ��"+s);
		//��ȡ����
		Class<?> c=clazz.getSuperclass();
		System.out.println("ClassTest��ĸ���:"+c);
		//��ȡField
		Field[] f=clazz.getFields();
		//����Field ����Ԫ��
		for(Field ff:f) {
			System.out.println("Field�ֶΣ�"+ff);
		}
		//��ȡ����public���ι�����
		Constructor[] con=clazz.getConstructors();
		System.out.println("����public���ι���������:");
		for(Constructor co:con) {
			System.out.println(co);
		}
		System.out.println("_______________________");
		//��ȡָ�������Ĺ�����
		Constructor<?> comn=clazz.getDeclaredConstructor(String.class);
		System.out.println("ָ���Ĺ�������"+comn);

		//��ȡָ���ķ���info��String s��{}
		Method method=clazz.getMethod("info", String.class);
		System.out.println("ָ���ķ���info��String s��:"+method);
		//��ȡ���Է���
		/**		������Ϣ�������� java.lang.Object�̳еõ��ķ���
		 * 
 ���еķ�����public static void Class.ClassTest.main(java.lang.String[]) throws java.lang.NoSuchMethodException,java.lang.Exception
���еķ�����public void Class.ClassTest.info(java.lang.String)
���еķ�����public void Class.ClassTest.info(java.lang.String,int)
���еķ�����public void Class.ClassTest.info()
���еķ�����public final void java.lang.Object.wait() throws java.lang.InterruptedException
���еķ�����public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
���еķ�����public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
���еķ�����public boolean java.lang.Object.equals(java.lang.Object)
���еķ�����public java.lang.String java.lang.Object.toString()
���еķ�����public native int java.lang.Object.hashCode()
���еķ�����public final native java.lang.Class java.lang.Object.getClass()
���еķ�����public final native void java.lang.Object.notify()
���еķ�����public final native void java.lang.Object.notifyAll()
		 */
		Method[] meth=clazz.getMethods();
		for (Method method2 : meth) {
			System.out.println("���еķ�����"+method2);
		}
		//��ȡ��Ӧ��ע��
		Annotation[] an=clazz.getAnnotations();
		for (Annotation annotation : an) {
			System.out.println(annotation);
		}//��ȡ�ڲ���
		Class<?>[] cl=clazz.getDeclaredClasses();
		for (Class<?> class1 : cl) {
			System.out.println("�ڲ���:"+class1);
		}
		Package pack=clazz.getPackage();
		System.out.println("��İ���Ϊ��"+pack);
		System.out.println("�ж�Class�����Ƿ��ʾö��:"+clazz.isEnum());
		System.out.println("�ж�Class�����Ƿ��ʾ����:"+clazz.isArray());
		}
}
