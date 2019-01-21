package TreeSet;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		//TreeSet默认从小到大的自然排序
		TreeSet t=new TreeSet();
		t.add(5);
		t.add(1);
		t.add(8);
		t.add(-2);
		System.out.println(t);
		//返回集合 中第一个元素
		System.out.println(t.first());
		//返回集合中最后一元素
		System.out.println(t.last());
		//返回小于4的子集，不包含4
		System.out.println(t.headSet(4));
		//返回大于或等于5的子集
		System.out.println(t.tailSet(5));
		//返回大于等于1小于5的集合
		System.out.println(t.subSet(1, 5));
	}

}
