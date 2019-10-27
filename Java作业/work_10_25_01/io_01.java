package work_10_25_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
 * ��ʹ�û����������ļ���
 * 3000����Ƭ�� ������ʱΪ��679225 ->11.32����
 * 30000����Ƭ��������ʱΪ��7059235 ->117.65����
 * ʹ�û����������ļ�:
 * 3000��ͼƬ��������ʱΪ��12717	->12.717��
 * 30000��ͼƬ��������ʱΪ��135461	->135.461��->2��12��
 * 300000��ͼƬ��������ʱΪ��1267562 ->21.12����
 */

public class io_01 {
	public static void main(String[] args) throws IOException {
		Date d1 = new Date();
		for (int i = 0; i < 300000; i++) {
			FileInputStream fis = new FileInputStream("F:/javafile_01/a.jpg");
			FileOutputStream fos = new FileOutputStream("F:/javafile_02/"+i+".jpg");
			BufferedInputStream bufis = new BufferedInputStream(fis);
			BufferedOutputStream bufos = new BufferedOutputStream(fos);
			int a = 0;
			while ((a = bufis.read())!=-1) {
				bufos.write(a);
			}
			bufis.close();
			bufos.close();
			
		}
		Date d2 = new Date();
		System.out.println("������ʱΪ��" + (d2.getTime()-d1.getTime()));
	}
}
