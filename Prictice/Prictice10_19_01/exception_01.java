package Prictice10_19_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exception_01 {
	public static void main(String[] args) throws IOException {
		FileReader reader = null;//new FileReader("f:/javafile/a.txt");
		try {
			char c1 = (char)reader.read();
			System.out.println(c1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();// �����쳣�ڸ����쳣ǰ
		}finally{
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
