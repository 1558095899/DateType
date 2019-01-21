package EnumSet;

import java.util.EnumSet;
import java.util.*;

enum Senson{
	SPRING,SUMMER,FALL,WINTER;
}
public class EnumSetTest {

	public static void main(String[] args) {
		//创建EnumSet集合，集合元素就是Senson枚举类的全部枚举值
		EnumSet e=EnumSet.allOf(Senson.class);
		System.out.println(e);
		//创建指定枚举类型的空集
		EnumSet e1=EnumSet.noneOf(Senson.class);
		System.out.println(e1);
		//传入多个同一类型的枚举值
		EnumSet e2=EnumSet.of(Senson.SPRING,Senson.SUMMER);
		System.out.println(e2);
		//包含从summer到winter的集合
		EnumSet e3=EnumSet.range(Senson.SUMMER, Senson.WINTER);
		System.out.println(e3);
		//获取集合e3外所有Senson集合里的元素
		//即 e3集合元素+e4集合元素=Senson集合元素; 
		EnumSet e4=EnumSet.complementOf(e3);
		System.out.println(e4);
		e1.add(Senson.SUMMER);
		System.out.println(e1);
		
		//EnumSet可以复制Collection集合中的所以元素创建新的EnumSet集合
		Collection c=new HashSet();
		c.add(Senson.SPRING);
		c.add(Senson.WINTER);
		System.out.println(c);//[WINTER, SPRING]
		EnumSet en=EnumSet.copyOf(c);
		System.out.println(en);//[SPRING, WINTER]
		
		//如果Collection集合里的元素不全都是枚举类，EnumSet复制会出现异常
		c.add(7);
		System.out.println(c);
		en=EnumSet.copyOf(c);
		System.out.println(en);//ClassCastException
	}

}
