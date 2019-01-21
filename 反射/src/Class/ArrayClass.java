//通过反射 操作数组
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
		System.out.println("int[] 数组："+Arrays.toString(i));
	}
	private static void dowork(String... arr ) {
		System.out.println("String[] 数组："+Arrays.toString(arr));
	}
	public void dowork(String s,int i) {
		System.out.println("String:"+s+","+"int:"+i);
	}
}

public class ArrayClass {
	public static void main(String[] args) throws Exception {
		//获取Class对象
		Class clazz=ArraysDemo.class;
		//获取方法1  对于基本类型有
		Method method=clazz.getDeclaredMethod("dowork", int[].class);
		//调用静态方法  参数类型为int【】； 需要new一个新的数组对象并传入值  如 下
		method.invoke(null, new int[]{1,2,3});
		System.out.println("-------------------");
		
		//方法二   对于引用类型 有
		method=clazz.getDeclaredMethod("dowork", String[].class);
		//取消访问权限检查
		method.setAccessible(true);
		//method.invoke(null, new String[] {"a","b","c"});//  报错： wrong number of arguments
		//对于引用类型  需要Object类数组 包装起来
		method.invoke(null, new Object[] {new String[] {"a","b","c"}});
		
		//非静态方法
		method=clazz.getMethod("dowork", String.class,int.class);
		method.invoke(clazz.newInstance(), new Object[]{"lucy",18});
		
	}
}
