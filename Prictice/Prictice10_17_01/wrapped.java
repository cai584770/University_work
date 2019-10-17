package Prictice10_17_01;

public class wrapped {

	public static void main(String[] args) {
		// 基本数据类型转成包装类对象
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		//
		int c = b.intValue();
		double d = b.doubleValue();
		
		Integer e = new Integer("99399");
		Integer f = Integer.parseInt("1111111");
		
		String str = f.toString();
		
		System.out.println("Max=" + Integer.MAX_VALUE);
		
	}
}
