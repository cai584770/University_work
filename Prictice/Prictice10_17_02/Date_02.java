package Prictice10_17_02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_02 {
	public static void main(String[] args) throws ParseException {
		// ��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ���ַ���
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String s = d.format(new Date(400000000));
		System.out.println(s);
		
		// ���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת����Ӧ��ʱ�����
		DateFormat d1 = new SimpleDateFormat("yyyy��MM��dd�� hhʱmm��ss��");
		Date d2 = d1.parse("1999��2��22�� 10ʱ50��32��");
		System.out.println(d2);
		
		
	}
}
