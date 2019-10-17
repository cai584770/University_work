package Prictice10_17_01;

public class textStringBuilder {
	public static void main(String[] args) {
		// StringBuilder线程不安全， 效率高； StringBuffer线程安全， 效率低
		StringBuilder s = new StringBuilder("aaaaaaaaaa");
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		s.setCharAt(2, 'B');
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		
		// 测试可变字符序列的常用方法
		StringBuilder q = new StringBuilder();

		for (int i = 0; i < 26; i++) {
			q.append((char)('a' + i));
		}
		System.out.println(q);
		q.reverse();
		System.out.println(q);
		q.setCharAt(3, '?');
		System.out.println(q);
		q.insert(1, '1').insert(6, '2');
		System.out.println(q);
		q.delete(10, 15);
		System.out.println(q);
	}
}
