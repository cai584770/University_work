package LiTi03;

public class String_01 {

	public static void main(String[] args) {
		String str = "abc";
		String str1 = "aaaa";
		String str2 = str + str1;
		System.out.println(str2);
		System.out.println("|||||||");
		
		String str3 = "ddd";
		String str4 = "ddd";
		String str5 = new String("ddd");
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str3 == str5);
	}
}
