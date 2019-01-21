package Exception;

public class ExceptionClassDemo {
	public static void main(String[] args){
		String str="li";
		System.out.println(str);
		int age=Integer.parseInt("20l");
		//异常exception NumberFormatException

		System.out.println(age);
	}
}
