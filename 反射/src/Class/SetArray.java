//设置数组 并设值
package Class;

import java.lang.reflect.Array;

public class SetArray {
	public static void main(String[] args) {
		//创建数组对象 类型为String 长度为4
		Object arr=Array.newInstance(String.class, 4);
		//为数组设置值
		Array.set(arr, 2, "第三个元素");
		Array.set(arr, 1, "第二个元素");
		//此时不能用for迭代数组
		//用Array类中get 方法  获取
		Object o1=Array.get(arr, 1);
		System.out.println(o1);
		Object o2=Array.get(arr, 2);
		System.out.println(o2);
	}
}
