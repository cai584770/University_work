package Equals;

/*
 * ˵��equals
 * �����������ͣ� �Ƚϵ���ֵ
 * �����������ͣ� �Ƚϵ�����������ĵ�ַ
 */

public class equals_1 {
	
	public static void main(String[] args) {
		
		int x = 1;
		float y = 1;
		
		System.out.println(x == y); //true ֵ�Ƚ�
		
		Person p1 = new Person("xiaoming", 10);
		Person p2 = new Person("xiaoqiang", 12);
		
		System.out.println(p1.equals(p2)); //false
		
		p1 = p2; // ��p2�ĵ�ַ����p1
		System.out.println(p1.equals(p2)); //true
	}
}
