package Prictice10_20_01;

public class fanXing_01 {
	public static void main(String[] args) {
		myCollection<String> mc = new myCollection<String>();
		mc.set("ddd", 0);
		myCollection<Integer> mc1 = new myCollection<Integer>();
		mc1.set(8888, 0);
		
		String a = mc.get(0);
		Integer b = mc1.get(0);
		System.out.println(a);
		System.out.println(b);
	}
	
}

class myCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
	
}
