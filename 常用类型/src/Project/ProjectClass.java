package Project;

public class ProjectClass {
	int s=5;
	public static void do1(){
		System.out.println("方法1");
	}
	private void do2(){
			System.out.println("方法2");
	}
	public int do3(int x){
		int i=x+1;
		return i;
	}

	public static void main(String[] args) {
		do1();
		ProjectClass p = new ProjectClass();
		p.do2();
		int i1 = p.do3(5);
		System.out.println(p.s);
		System.out.println(i1);
		SubClass s = new SubClass();
		s.do3();
		Super sb = new Sub();
		sb.do4();
		Sub n = new Sub();
		n.do5();
	}

}
class SuperClass{
	int t=7;
	public void do3(){
		System.out.println("父类");
	}
}
class SubClass extends SuperClass{
	int t=6;
	public void do3(){
		super.do3();
		int t=5;
		System.out.println("子类");
		System.out.println(this.t);
		System.out.println(t);
		System.out.println(new SuperClass().t);
	}
}
class Super{
	public void do4(){}
	Super(){
		System.out.println(2222);
	}
}
class Sub extends Super{
	static void do5(){
		System.out.println(4444);
	}
	public void do4(){
		System.out.println(333333);
	}
	Sub(){
		super();
		System.out.println(11111);
	}
}
