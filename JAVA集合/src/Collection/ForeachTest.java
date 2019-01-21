package Collection;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest {

	public static void main(String[] args) {
		Collection c=new HashSet();
		c.add("7");
		c.add("8");
		for(Object obj:c){
			System.out.println(obj);
			String book=(String)obj;//强制转换
			System.out.println(book);
		}

	}

}
