package Queue;

import java.util.ArrayDeque;

public class ArrayDequeTest {

	public static void main(String[] args) {
		//栈
		ArrayDeque ad=new ArrayDeque();
		ad.push(7);//栈底
		ad.push(8);
		ad.push(9);//栈顶
		for(Object o:ad){
			System.out.println(o);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}System.out.println(ad);
		System.out.println(ad.peek());//获取栈顶，但不（pop）出栈
		System.out.println(ad);
		ad.pop();//pop 出栈
		System.out.println(ad);
	}

}
