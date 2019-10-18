package Prictice10_18_01;

import java.io.File;

public class Digui {
	public static void main(String[] args) {
		File f = new File("F:\\BaiduNetdiskDownload\\Java从入门到精通（项目案例版）");
		printFile(f, 0);
	}
	
	public static void printFile(File file ,int level) {
		System.out.println(file.getName());
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			
			for(File temp:files) {
				printFile(temp,level + 1);
			}
		}
	}
	
}
