package Prictice10_17_02;

import java.util.Date;

public class Date_01 {
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		System.out.println(d1.after(d));
	}
}
