package ThreadSafe;
public class SynchronizeClass implements Runnable{
	int num=10;
	public void run(){
		while(true){	
		if(num>0){
			System.out.println(num--);
			}
		}
	}
	public static void main(String[] args) {
		
		SynchronizeClass s=new SynchronizeClass();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		t1.start();
		t2.start();
		
		
		
		
		
		for(int i=0;i<10;i++){
			System.out.println("i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 

	}

}
