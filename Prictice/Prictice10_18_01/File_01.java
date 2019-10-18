package Prictice10_18_01;

import java.io.File;
import java.util.Date;;

public class File_01 {
	public static void main (String[] args) throws Exception {
		File f = new File("a.txt");
		f.createNewFile();
		f.renameTo(new File("cc.txt"));
		File a = new File("b.txt");
		a.createNewFile();
		System.out.println(a.exists());// 是否存在
		System.out.println(a.isDirectory());// 是否是目录
		System.out.println(a.isFile());// 是否是文件
		System.out.println(new Date(a.lastModified()));// 最后修改时间
		System.out.println(a.length()); // 文件的大小
		System.out.println(a.getName()); // 文件名
		System.out.println(a.getPath()); // 相对文件路径
		System.out.println(a.getAbsolutePath()); // 绝对文件路径
		f.delete();
		
	}
}
