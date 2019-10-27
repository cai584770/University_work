package work_10_25_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
 * 不使用缓冲区复制文件：
 * 3000张照片： 拷贝耗时为：679225 ->11.32分钟
 * 30000张照片：拷贝耗时为：7059235 ->117.65分钟
 * 使用缓冲区复制文件:
 * 3000张图片：拷贝耗时为：12717	->12.717秒
 * 30000张图片：拷贝耗时为：135461	->135.461秒->2分12秒
 * 300000张图片：拷贝耗时为：1267562 ->21.12分钟
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
		System.out.println("拷贝耗时为：" + (d2.getTime()-d1.getTime()));
	}
}
