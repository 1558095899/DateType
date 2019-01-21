package date;

import java.text.DateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		Date d=new Date();
		System.out.println(d);
		DateFormat df= DateFormat.getInstance();
		System.out.println(df.format(d));
	}
}
