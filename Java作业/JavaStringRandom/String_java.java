package string_java;

import java.util.Random;//����

public class String_java {
	public static void main(String[] args) {
		
		String[] array1 = new String[] {"44444", "7155","844891","4984623",
				"9964987", "4981919", "4966563", "0", "11", "223",
				"3348", "584770"};
		String[] array2 = new String[] {"laoshi", "xuesheng", "chuzi", 
				"jiaoshou", "shangren", "yisheng", "chengxuyuan", 
				"gongchengshi", "laoban", "siji", "gongwuyuan", 
				"lvshi"};
		String[] array3 = new String[] {"xiaoming", "xiaohong", "sunwukong", 
				"baigujing", "xiaoxuanfeng", "heima", "tangseng", "tangsanzang",
				"zhubajie", "shaheshang", "shaseng", "bailongma"};
		
		Random a = new Random();//���������
		int b = a.nextInt(12);	//ȷ���������Χ
		String c = array1[b] + array2[b] + array3[b];//����һ���ַ�
		
		System.out.println(c); //����ַ�
		System.out.println(c.length());//����ַ��ĳ���
	}
}
