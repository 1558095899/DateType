package Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableClass implements Callable<Integer>{

	public static void main(String[] args) {
		CallableClass cc=new CallableClass();
		FutureTask<Integer> task=new FutureTask<Integer>(cc);
		for(int i=0;i<50;i++){
			System.out.println("ooo"+i);
			if(i==20){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				new Thread(task,"有返回值").start();
			}
		}
				try {
					System.out.println("返回值"+task.get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

	@Override
	public Integer call(){
		int i=0;
		for(;i<50;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
		return i;
	}

}
