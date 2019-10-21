package work_10_18_03;

import java.util.Scanner;

public class Person {
	private String name;
	private String sex;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age<120 && age>0) {
			this.age = age;
		}else {
			throw new RuntimeException("��������ȷ������!");
		}
	}

	public void setSex(String sex) {
		if(sex.equals("female")||sex.equals("male")) {
			this.sex = sex;
		}else {
			throw new RuntimeException("��������ȷ���Ա�");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void show() {
		System.out.println("������" + name + " �Ա� " + sex + " ����:" + age);
	}
	
/*
 * Scanner s1 = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("������������");
		p1.setName(s1.next());
		System.out.println("�������Ա�");
		p1.setSex(s1.next());
		System.out.println("���������䣺");
		p1.setAge(s1.nextInt());
 */
	public void person(){
		Scanner s1 = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("������������");
		p1.setName(s1.next());
		System.out.println("�������Ա�");
		p1.setSex(s1.next());
		System.out.println("���������䣺");
		p1.setAge(s1.nextInt());
		p1.show();
	}
	
}
