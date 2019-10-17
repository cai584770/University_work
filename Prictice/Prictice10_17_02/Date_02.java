package Prictice10_17_02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_02 {
	public static void main(String[] args) throws ParseException {
		// 把时间对象按照“格式字符串指定的格式”转成相应的字符串
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = d.format(new Date(400000000));
		System.out.println(s);
		
		// 把字符串按照“格式字符串指定的格式”转成相应的时间对象
		DateFormat d1 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
		Date d2 = d1.parse("1999年2月22日 10时50分32秒");
		System.out.println(d2);
		
		
	}
}
