package Runtime;

public class Start extends Thread{
	public void run(){
		System.out.println("------------");
	}
	public static void main(String[] args) {
		Start s=new Start();
		s.start();
		s.start();//一个对象调用两次start（）方法出现异常     IllegalThreadStateException
	}

}
