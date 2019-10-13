package Equals;

/*
 * 说明equals
 * 基本数据类型： 比较的是值
 * 引用数据类型： 比较的是两个对象的地址
 */

public class equals_1 {
	
	public static void main(String[] args) {
		
		int x = 1;
		float y = 1;
		
		System.out.println(x == y); //true 值比较
		
		Person p1 = new Person("xiaoming", 10);
		Person p2 = new Person("xiaoqiang", 12);
		
		System.out.println(p1.equals(p2)); //false
		
		p1 = p2; // 将p2的地址赋给p1
		System.out.println(p1.equals(p2)); //true
	}
}
