package Prictice10_17_02;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date_03 {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar(1999 ,13 ,22 ,10 ,50);
		System.out.println(c);
		
		int a = c.get(Calendar.YEAR);
		System.out.println(a);
		int b = c.get(Calendar.MONTH);// 0是1月， 11是12月, 13是1
		System.out.println(b);
		
		Calendar c1 = new GregorianCalendar();
		c1.set(Calendar.YEAR, 9102);
		int d = c1.get(Calendar.YEAR);
		System.out.println(d);
		
		Calendar c2 = new GregorianCalendar();
		c2.add(Calendar.YEAR, 100);
		int f = c2.get(Calendar.YEAR);
		System.out.println(f);
		
		Calendar c3 = new GregorianCalendar();
		c3.setTime(new Date());
		printfCal(c3);
		
		
	}
	
	public static void printfCal(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK) - 1;
		String dayweek = (week == 0?"日" : week+"");
		
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		
		System.out.println(year + "年" + month + "月" + 
				date + "日" + hour + " 时" + 
				min + "分"+ sec +"秒 " + 
				" 周" + dayweek);
	}
}
