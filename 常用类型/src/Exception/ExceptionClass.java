package Exception;

class Person{
	public void dose(){
		System.out.println("--------");
	}
	
}
public class ExceptionClass extends Person{
	@Override
	public void dose(){
		this.dose();
	}
	public static void main(String[] args) {
		new ExceptionClass().dose();
		
	}

}
