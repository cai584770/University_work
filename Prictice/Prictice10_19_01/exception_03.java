package Prictice10_19_01;

public class exception_03 {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-10);
	}
}

class Person{
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age<0) {
			throw new illegalAgeException("年龄不能为负数");
		}
		this.age = age;
	}
}

class illegalAgeException extends RuntimeException{
	public illegalAgeException() {
	}
	
	public illegalAgeException(String msg) {
		super(msg);
	}
	
}