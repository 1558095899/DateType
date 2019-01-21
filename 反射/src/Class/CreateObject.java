//通过反射创建对象
package Class;

import java.lang.reflect.Constructor;

class Uer{
	public Uer(){
		System.out.println("无参数构造器");
	}
	public Uer(String name) {
		System.out.println("有参数构造器："+name);
	}
	private Uer(String name,int i) {
		System.out.println("名字："+name+"年龄："+i);
	}
}

//通过反射 获取构造器 并 创建对象
public class CreateObject {
	public static void main(String[] args) throws Exception{
		//获取对应的Class对象
		Class<Uer> clazz=Uer.class;
		//方法一     对于公共无参数的构造器可以直接创建对象
		clazz.newInstance();//无参数构造器
		
		//方法二    获取对于构造器
		
		Constructor con=clazz.getConstructor(String.class);
		//通过构造器创建对象
		con.newInstance("will");
		System.out.println("---------------");
		//获取无参数构造器并创建对象
		Constructor con1=clazz.getConstructor();
		con1.newInstance();
		
		//访问私有化（private）构造器 并创建对象
		Constructor con2=clazz.getDeclaredConstructor(String.class,int.class);
		//取消访问权限检查
		con2.setAccessible(true);
		con2.newInstance("will",18);
	}
}
