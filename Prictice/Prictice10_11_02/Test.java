package Prictice10_11_02;

/*
 * 抽象类和接口的练习
 */

public class Test {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.eat();
		a.run();
		a.sleep();
//		a.teZheng();
		
		Cat b = new Cat();
		b.eat();
		b.run();
		b.sleep();
		b.teZheng();
		
		Dog c = new Dog();
		c.eat();
		c.run();
		c.sleep();
		c.teZheng();
		
		AnimalInt d = new Dog();
		d.eat();
		d.run();
		d.sleep();
//		d.teZheng();
	}
}
