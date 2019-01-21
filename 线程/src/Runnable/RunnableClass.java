package Runnable;

import java.awt.Container;
import java.net.URL;
import javax.swing.*;
public class RunnableClass extends JFrame{

	private JLabel j=new JLabel();
	private int count=0;
	static Thread t;
	public RunnableClass(){
		Container c=getContentPane();
		setTitle("滚");
		setBounds(500,500,300,300);
		setLayout(null);
		URL url=RunnableClass.class.getResource("2.jpg");
		Icon i=new ImageIcon(url);
		j.setIcon(i);
		j.setHorizontalAlignment(SwingConstants.LEFT);
		j.setBounds(10,10,200,50);
		j.setOpaque(true);
		 t=new Thread(new Runnable(){
			public void run(){
				while(count<=200){
					j.setBounds(count,10,200,50);
					try{
						Thread.sleep(1000);
					}catch(Exception e){
						
						e.printStackTrace();
					}count +=20;
					if(count==200){
						count=10;
					}
				}
			}
		}	
				);
		t.start();
		c.add(j);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new RunnableClass();
	}

}
