package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class CollectionTest {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("集合");
		c.add(6);
		System.out.println("c元素有："+c);
		System.out.println("个数有："+c.size());
		c.remove(6);//删除元素6
		System.out.println("元素有："+c);
		System.out.println(c.contains(6));//c里是否包含6
		c.clear();//清除元素
		System.out.println("c里有元素："+c);
		Collection cc=new ArrayList();
		cc.add(8);
		cc.add(7);
		Collection b=new HashSet();
		b.add(6);
		b.add(7);
		//b.addAll(cc); //cc元素全部加到b中
		System.out.println("两个集合元素有："+b);//Set体系 元素不可重复
		//cc.addAll(b);
		System.out.println("两个集合元素有："+cc);//List体系  元素可重复
		cc.retainAll(b);
		System.out.println("两个集合交集元素有："+cc);
		
	}

}
