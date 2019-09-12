package string_java;

import java.util.Random;//导包

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
		
		Random a = new Random();//创建随机数
		int b = a.nextInt(12);	//确定随机数范围
		String c = array1[b] + array2[b] + array3[b];//产生一串字符
		
		System.out.println(c); //输出字符
		System.out.println(c.length());//输出字符的长度
	}
}
