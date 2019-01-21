package Set;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {

	public static void main(String[] args) {
		String s1=new String("123");
		String s2=new String("123");
		System.out.println(s1.equals(s2));
		HashSet s=new HashSet();
		s.add("5");
		s.add("6");
		s.add("9");
		System.out.println(s);
		Iterator it=s.iterator();//获取s集合对应的迭代器
		 String first=(String)it.next();//获取集合里的第一个元素
		 System.out.println(first);
		 HashSet s3=new HashSet();
		 s3.add(new A());
		 s3.add(new A());
		 System.out.println(s3);
		 System.out.println(new A().equals(new A()));//false
		 s3.add(new B());
		 s3.add(new B());
		 System.out.println(s3);
	}

}
//返回false或hashCode值不等时，储存两个位置
class A{
	
}
//把某个类的对象保存到HashSet集合中，应尽量保证两个对象通过equals（）方法返回true时，
//它们的hashCode（）方法返回值也相等。
class B{
	public boolean equals(Object obj){
		return true;
	}
	public int hashCode(){
		return 1;
	}
}