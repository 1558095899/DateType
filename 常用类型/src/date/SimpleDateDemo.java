package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;

public class SimpleDateDemo {
	public static void main(String[] args) {
		SimpleDateFormat s = new SimpleDateFormat();
		String st = "yy-MM-dd HH-m-ss";
		s.applyPattern(st);
		String time = s.format(new Date());
		out.println(time);
	}
}
