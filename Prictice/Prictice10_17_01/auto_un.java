package Prictice10_17_01;

public class auto_un {
	public static void main(String[] args) {
		Integer a = 234; // Integer a = Integer.value(234); 自动装箱
		int b = a; // int b = a.intValue(); 自动拆箱
		
		Integer c = null;
//		if(c!=null) {
//			int d = c;
//		}
		
		// 缓存【-128， 127】 之间的缓存数组
		Integer i3 = -128;
		Integer i4 = -128;
		System.out.println(i3 == i4); // true i3和i4在缓存范围内
		System.out.println(i3.equals(i4));// true
		// 1234不在缓存数组之间， 故每次创建的都是新的对象地址
		Integer i1 = 1234;
		Integer i2 = 1234;
		System.out.println(i1 == i2); // false i1和i2不在缓存范围， 比较的是地址， 两个是不同的对象
		System.out.println(i1.equals(i2)); // true 比较的是值
	}
}
