package Equals;

public class Person {
	private int age;
	private String name;
	
	public Person(String string, int i) {
	}

	// equals_1 ���к���дequals
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj instanceof Person) {
		Person p = (Person)obj; // ��Object����ת��ΪPerson����
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
