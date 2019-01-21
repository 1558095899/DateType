//通过反射获取方法 并调用方法
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
		//获取Class对象
		Class clazz=Dog.class;
		//获取无参数方法
		Method method=clazz.getMethod("dowork");
		//通过反射调用无参数方法
		method.invoke(clazz.newInstance());
		
		//获取String参数方法
		 method=clazz.getMethod("dowork", String.class);
		 //调用String参数方法
		 method.invoke(clazz.newInstance(), "will");
		 
		 //获取被私有化的方法 并调用
		 method=clazz.getDeclaredMethod("dowork", String.class,int.class);
		 //取消访问权限检查
		 method.setAccessible(true);
		 Object o=method.invoke(clazz.newInstance(), "will",18);
		 System.out.println(o);//null
		 
		 //使用反射调用静态方法
		 method= clazz.getDeclaredMethod("dowork", int.class);
		 //传入的对象设置为null
		 method.invoke(null, 22);
	}
}
