package Runnable;
class Person implements Runnable{
	int sum=50;
	public void run(){
		for(int i=0;i<50;i++){
			if(sum>0){
				System.out.println(Thread.currentThread().getName()+"吃苹果"+sum--);
			}
		}
	}
}
public class EatApple {

	public static void main(String[] args) {
		Person p=new Person();
		new Thread(p,"小A").start();
		new Thread(p,"小B").start();
		new Thread(p,"小C").start();

	}

}
