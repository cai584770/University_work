package work_10_25_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class io_02 {
	public static void main(String[] args) throws IOException {
		System.out.println("----有无缓冲区对比----");
		Reader reader = new FileReader("F:/javafile/1.txt");
		Date d1 = new Date();
		int c = 0;
		while((c = reader.read())!=-1) {
		}
		Date d2 = new Date();
		System.out.println("无缓冲区读取时间:"+(d2.getTime()-d1.getTime()));
		reader.close();
		reader = new BufferedReader(new FileReader("F:/javafile/1.txt"));
		
		Date d3 = new Date();
		while ((c = reader.read())!=-1) {
		}
		Date d4 = new Date();
		System.out.println("有缓冲区读取时间："+(d4.getTime()-d3.getTime()));
	}
}
