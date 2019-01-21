package ArrayyList;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(new String("JAVA"));
		l.add("9");
		l.add(8);
		System.out.println(l);
		//将元素插入到 指定的位置
		l.add(1,7);
		System.out.println(l);//[JAVA, 7, 9, 8]
		//删除索引位置
		l.remove(0);
		System.out.println(l);
		//返回指定索引位置的值
		System.out.println(l.get(2));//8
		//ArrayList遍历
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		//替换索引位置的值
		l.set(0, 6);
		System.out.println(l);
		System.out.println(l.indexOf(8));//返回元素的索引位置
		ArrayList l1=new ArrayList();
		l1.add(11);
		l1.add(22);
		System.out.println(l1);
		//将集合l1加入l
		l.addAll(l1);
		System.out.println(l);
		//返回从1到3的子集
		System.out.println(l.subList(1, 3));
	}

}
