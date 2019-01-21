package Set;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		//有序排序
		LinkedHashSet l=new LinkedHashSet();
		l.add(7);
		l.add(8);
		l.add(9);
		System.out.println(l);
		l.remove(7);
		System.out.println(l);
		l.add(1);
		System.out.println(l);
	}

}
