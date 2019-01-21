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
	
	//创建private修饰的构造器
	private ClassTest(){
		System.out.println("private修饰构造器");
	}
	//创建public修饰的构造器
	public ClassTest(String s){
		
	}
	//
	public ClassTest(String s,int i) {
		
	}
	//方法1
	public void info() {
		
	}
	//方法2
	public void info(String s) {
		
	}
	//方法3
	public void info(String s,int i) {
		
	}
	//Field
	public int i;
	public int n;
	//内部类
	class in{
		
	}
	public static void main(String[] args) throws NoSuchMethodException, Exception {
		//获取ClassTest类对应的Class
		 Class<ClassTest> clazz=ClassTest.class;
		 System.out.println(clazz);
		 //获取类名
		String s=clazz.getName();
		System.out.println("对应类名为："+s);
		//获取父类
		Class<?> c=clazz.getSuperclass();
		System.out.println("ClassTest类的父类:"+c);
		//获取Field
		Field[] f=clazz.getFields();
		//遍历Field 数组元素
		for(Field ff:f) {
			System.out.println("Field字段："+ff);
		}
		//获取所以public修饰构造器
		Constructor[] con=clazz.getConstructors();
		System.out.println("所有public修饰构造器如下:");
		for(Constructor co:con) {
			System.out.println(co);
		}
		System.out.println("_______________________");
		//获取指定参数的构造器
		Constructor<?> comn=clazz.getDeclaredConstructor(String.class);
		System.out.println("指定的构造器："+comn);

		//获取指定的方法info（String s）{}
		Method method=clazz.getMethod("info", String.class);
		System.out.println("指定的方法info（String s）:"+method);
		//获取所以方法
		/**		方法信息：包括从 java.lang.Object继承得到的方法
		 * 
 所有的方法：public static void Class.ClassTest.main(java.lang.String[]) throws java.lang.NoSuchMethodException,java.lang.Exception
所有的方法：public void Class.ClassTest.info(java.lang.String)
所有的方法：public void Class.ClassTest.info(java.lang.String,int)
所有的方法：public void Class.ClassTest.info()
所有的方法：public final void java.lang.Object.wait() throws java.lang.InterruptedException
所有的方法：public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
所有的方法：public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
所有的方法：public boolean java.lang.Object.equals(java.lang.Object)
所有的方法：public java.lang.String java.lang.Object.toString()
所有的方法：public native int java.lang.Object.hashCode()
所有的方法：public final native java.lang.Class java.lang.Object.getClass()
所有的方法：public final native void java.lang.Object.notify()
所有的方法：public final native void java.lang.Object.notifyAll()
		 */
		Method[] meth=clazz.getMethods();
		for (Method method2 : meth) {
			System.out.println("所有的方法："+method2);
		}
		//获取对应的注释
		Annotation[] an=clazz.getAnnotations();
		for (Annotation annotation : an) {
			System.out.println(annotation);
		}//获取内部类
		Class<?>[] cl=clazz.getDeclaredClasses();
		for (Class<?> class1 : cl) {
			System.out.println("内部类:"+class1);
		}
		Package pack=clazz.getPackage();
		System.out.println("类的包名为："+pack);
		System.out.println("判断Class对象是否表示枚举:"+clazz.isEnum());
		System.out.println("判断Class对象是否表示数组:"+clazz.isArray());
		}
}
