package LiTi03;

public class String_02 {

	public static void main(String[] args) {
		String s1 = "core java";
		String s2 = "Core java";
		System.out.println(s1.charAt(3));
		System.out.println(s2.length());
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		String s3 = s1.replace(' ', '?');
		System.out.println(s3);
	}
	
}
