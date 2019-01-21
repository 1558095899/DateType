package TreeSet;
import java.util.Comparator;
import java.util.TreeSet;

class M{
	int age;
	public M(int age){
		this.age=age;
	}
	public String toString(){
		return ""+age;
	}
}
public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet t=new TreeSet(new Comparator(){
			public int compare(Object o1,Object o2){
				M m1=(M)o1;
				M m2=(M)o2;
				return m1.age>m2.age ? -1 : m1.age<m2.age ? 1:0;
			}
		});
t.add(new M(5));
t.add(new M(9));
System.out.println(t);
	}

}
