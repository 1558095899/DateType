package ClassJVM;
/**
 * @deprecated
 * @author 18877545427
 *
 */
class B{
	static {
		System.out.println("class B");
	}
}

public class Test2 {
	static {
	
		System.out.println("-----------------");
	}
	static int b=9;
	static int c=5;
	public static void main(String[] args) throws ClassNotFoundException {
		A b2=new A();
		System.out.println(b2.a);
		System.out.println(Test2.c);
		System.out.println("88888888888888");
		System.out.println(b);
		Class<?> c=Class.forName("java.util.Date");
		java.util.Date cla=new java.util.Date();
		Class cla1=cla.getClass();
		System.out.println(cla1);
		System.out.println(c);
		ClassLoader cl=ClassLoader.getSystemClassLoader();//获取系统类加载器
		System.out.println(cl);
		//获取系统类加载器的父类加载器    得到扩展加载器
		ClassLoader c2=cl.getParent();
		System.out.println(c2);
		System.out.println(System.getProperty("java.ext.dirs"));//扩展加载器路径
		//获取扩展加载器的父类  得到根加载器
		ClassLoader c3=c2.getParent();
		System.out.println(c3);//null
		//实例化class B对象
		Class ccc=Class.forName("ClassJVM.B");//必须添加整个包名
		Package s=c.getPackage();
		System.out.println(s);
		System.out.println("-----------------");
		Class clazz=Test2.class;
		System.out.println(clazz);
	}

}
