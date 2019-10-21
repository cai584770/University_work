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
			throw new RuntimeException("请输入正确的年龄!");
		}
	}

	public void setSex(String sex) {
		if(sex.equals("female")||sex.equals("male")) {
			this.sex = sex;
		}else {
			throw new RuntimeException("请输入正确的性别！");
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
		System.out.println("姓名：" + name + " 性别： " + sex + " 年龄:" + age);
	}
	
/*
 * Scanner s1 = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("请输入姓名：");
		p1.setName(s1.next());
		System.out.println("请输入性别：");
		p1.setSex(s1.next());
		System.out.println("请输入年龄：");
		p1.setAge(s1.nextInt());
 */
	public void person(){
		Scanner s1 = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("请输入姓名：");
		p1.setName(s1.next());
		System.out.println("请输入性别：");
		p1.setSex(s1.next());
		System.out.println("请输入年龄：");
		p1.setAge(s1.nextInt());
		p1.show();
	}
	
}
