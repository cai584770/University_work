package Prictice10_19_01;

import java.io.FileReader;
import java.io.IOException;

public class exception_02 {
	public static void main(String[] args) throws IOException {
		readFile();
	}
	
	public static void readFile() throws IOException {
		FileReader reader = null;
		reader = new FileReader("f:/javafile/a.txt");
		char c1 = (char)reader.read();
		System.out.println(c1);
		if(reader != null) {
			reader.close();
		}
	}
}
