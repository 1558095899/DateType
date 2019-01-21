package Thread;

import java.lang.Thread;
class ThreadDowork extends Thread{
	public void run(){
		for(int i=1;i<=50;i++){
			System.out.println("游戏"+i);
		}
	}
	
}
public class ThreadClass {

	public static void main(String[] args) {
			for(int i=1;i<=50;i++){
				System.out.println("音乐"+i);
				if(i==10){
					new ThreadDowork().start();
				}
			}

	}

}
