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
		System.out.println(a.exists());// �Ƿ����
		System.out.println(a.isDirectory());// �Ƿ���Ŀ¼
		System.out.println(a.isFile());// �Ƿ����ļ�
		System.out.println(new Date(a.lastModified()));// ����޸�ʱ��
		System.out.println(a.length()); // �ļ��Ĵ�С
		System.out.println(a.getName()); // �ļ���
		System.out.println(a.getPath()); // ����ļ�·��
		System.out.println(a.getAbsolutePath()); // �����ļ�·��
		f.delete();
		
	}
}
