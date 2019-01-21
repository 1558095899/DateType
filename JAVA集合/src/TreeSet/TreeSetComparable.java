package TreeSet;

import java.util.TreeSet;


class e implements Comparable{
	int age;
	public e(int age){
		this.age=age;
	}
	public String toString(){
		return ""+age;
	}
	public int compareTo(Object obj){
		return 0;
	}
}
public class TreeSetComparable {
	
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		e a=new e(7);
		t.add(a);
		System.out.println(t.add(a));//true
		System.out.println(t);
	}

}
