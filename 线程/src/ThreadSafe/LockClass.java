

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockClass implements Runnable{
	int num=10;
	
	public void m(){
		
		
			if(num>0){
				System.out.println(Thread.currentThread().getName()+num--);
				try{
					Thread.sleep(1);
				}catch(Exception e){
					e.printStackTrace();
				}finally{
					
				}
			}
		}
	public void run(){
		for(int i=0;i<10;i++){
			m();
		}
	}
	public static void main(String[] args) {
		LockClass lc=new LockClass();
		new Thread(lc,"Y").start();

	}

}
