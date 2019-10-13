package Equals;

public class Person {
	private int age;
	private String name;
	
	public Person(String string, int i) {
	}

	// equals_1 运行后重写equals
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Person) {
		Person p = (Person)obj; // 将Object类型转换为Person类型
		boolean b = this.name == p.name && this.age == p.age;
	 
		return b;
		}else {
			return false;
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
