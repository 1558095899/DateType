package Thread;

public class ThreadAndRunnableClass {

	public static void main(String[] args) {
		for(int i=1;i<=50;i++){
			System.out.println("游戏"+i);
			if(i==10){
				new Thread(new Runnable(){	//接口new Runnable()
					public void run(){
						for(int i=1;i<=50;i++){
							System.out.println("音乐"+i);
						}
					}
				}).start();
			}
		}
	}

}
