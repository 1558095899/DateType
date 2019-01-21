

import java.lang.Thread;
class person extends Thread{
	static int num=50;//加static后不会重复创建内存
	public person(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<50;i++){
			if(num>0){	//设置num值大于0
				System.out.println(super.getName()+"吃苹果"+num--);
			}
		}
	}
}
public class EatApple {

	public static void main(String[] args) {
		new person("小A").start();
		new person("小B").start();
		new person("小C").start();
		
	}

}
