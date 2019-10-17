package Prictice10_17_02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_04 {
	public static void main(String[] args) throws ParseException {
		String str = "2019-9-1";
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		Date date = d.parse(str);
		Calendar c = new GregorianCalendar();
		c.setTime(date);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		for (int i = 0; i < c.get(Calendar.DAY_OF_WEEK)-1; i++) {
			System.out.print("\t");
		}
		int days = c.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= days; i++) {
			System.out.print(c.get(Calendar.DAY_OF_MONTH) + "\t");
			if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				System.out.println();
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
