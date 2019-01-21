package FirstDemo;


import java.util.ArrayList;
import java.util.List;

public class FirstDemo {
	public void test(List<?> c) {
		for(int i=0;i<c.size();i++){
			System.out.println(c.get(i));
		}
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("JavaSE");
		list.add("JavaEE");
		list.add("JavaWE");
		FirstDemo f=new FirstDemo();
		f.test(list);
	}

}
