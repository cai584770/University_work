package Equals;

/*
 * 重写equals
 * 
 */

public class equals_2 {
	
	public static void main(String[] args) {
		Person p1 = new Person("xiaoming", 10);
		Person p2 = new Person("xiaoqiang", 12);
		Object o1 = new Object();
		
		boolean a = p1.equals(o1);
		boolean b = p1.equals(p2);
		System.out.println(a);// false o1为Object类型， p1为Person类型
		System.out.println(b);// true p1和p2都是Person类型
	}

}
