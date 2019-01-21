package TreeSet;

import java.util.TreeSet;

class A{
	
}

public class TreeSetException {

	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		t.add(new A());//ClassCastException
	}

}
