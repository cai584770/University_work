package Prictice10_17_01;

public class textStringBuilder {
	public static void main(String[] args) {
		// StringBuilder�̲߳���ȫ�� Ч�ʸߣ� StringBuffer�̰߳�ȫ�� Ч�ʵ�
		StringBuilder s = new StringBuilder("aaaaaaaaaa");
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		s.setCharAt(2, 'B');
		System.out.println(Integer.toHexString(s.hashCode()));
		System.out.println(s);
		
		// ���Կɱ��ַ����еĳ��÷���
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
