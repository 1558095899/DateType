package Queue;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		//栈，双端队列
		LinkedList l=new LinkedList();
		//元素加入队列尾部
		l.add(1);
		System.out.println(l);
		l.offer(2);
		System.out.println(l);
		//元素加入栈顶
		l.push(3);
		System.out.println(l);//[3, 1, 2]
		System.out.println(l.peekFirst());//访问但不删除栈顶元素
		System.out.println(l.peekLast());//访问但不删除栈底元素
		System.out.println(l.pollFirst());//访问并删除栈顶元素
		System.out.println(l);//[1, 2]
		System.out.println(l.pop());
		System.out.println(l);
		l.offer(8);
		System.out.println(l);
		System.out.println(l.remove());
		System.out.println(l);
	}

}
