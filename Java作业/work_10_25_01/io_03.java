package work_10_25_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Date;

public class io_03 {
	public static void main(String[] args) throws IOException {
		
		// 拷贝文件
		Date d1 = new Date();
		for (int i = 0; i < 3000; i++) {
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
		System.out.println("copy over"+(d2.getTime()-d1.getTime()));
		
		// 文件拼接
		Date d3 = new Date();
		OutputStream bur = new BufferedOutputStream(new FileOutputStream("F:/javafile_03/sum.jpg"));
		for (int j = 0; j < 3000; j++) {
			InputStream buw = new BufferedInputStream(new FileInputStream("F:/javafile_02/"+j+".jpg"));
			int b = 0;
			while((b = buw.read())!=-1) {
				bur.write(b);
			}
			buw.close();
		}
		bur.close();
		Date d4 = new Date();
		System.out.println("###"+(d4.getTime()-d3.getTime()));
	}
	
//	public void merge() {
//		
//	}
}
