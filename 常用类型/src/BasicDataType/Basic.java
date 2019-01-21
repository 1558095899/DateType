package BasicDataType;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Student";
		System.out.println(s.length());
		System.out.println(s.lastIndexOf("t"));
		System.out.println(s.charAt(6));
		System.out.println(s.substring(0,3));
		String s1="Student";
		System.out.println(s.equals(s1));
		boolean b=s==s1;
		System.out.println(b);
		String s2=new String("abc");
		String s3=new String("abc");
		boolean b1=s2.equals(s3);
		boolean b2=s2==s3;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}
}
