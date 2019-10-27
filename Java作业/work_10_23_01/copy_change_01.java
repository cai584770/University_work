package work_10_23_01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy_change_01 {
	public static void main(String[] args) throws IOException {
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("F:\\javafile\\a.jpg"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("F:\\javafile\\b.jpg"));
		int by = 0;
		while((by = bufis.read())!=-1) {
			bufos.write(by);;
		}
		bufos.close();
		bufis.close();
	}
}
