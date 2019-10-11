package Prictice10_11_02;

public class Cat extends Animal{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("跳");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("鱼");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("睡沙发");
	}
	
	public void teZheng() {
		System.out.println("不理人");
	}
}
