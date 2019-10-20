package Prictice10_20_02;

public class arrayList_03 {
	public static void main(String[] args) {
		SxtArrayList2 s1 = new SxtArrayList2();
		for (int i = 0; i < 40; i++) {
			s1.add("?" + i);
		}
		s1.set("lll", 10);
		s1.set("lll", -1);
		System.out.println(s1);
		System.out.println(s1.get(10));
		
	}
}

class SxtArrayList2<E>{
	private Object[] ele;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public SxtArrayList2(){
		ele = new Object[DEFALT_CAPACITY];
	}
	
	public void add(E e) {
		if(size == ele.length) {
			Object[] newArray = new Object[ele.length+(ele.length>>1)];
			System.arraycopy(ele, 0, newArray, 0, ele.length);
			ele = newArray;
		}
		
		ele[size++] = e;
	}
	
	public E get(int index) {
		return (E)ele[index];
	}
	
	public void set(E e, int index) {
		if(index < 0||index > size - 1) {
			throw new RuntimeException("索引不合法" + index);
		}
		
		
		ele[index] = e;
		
	}
	
	
	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < size; i++) {
			s.append(ele[i] + " ");
		}
		s.setCharAt(s.length()-1, ']');
		
		return s.toString();
		
	}
	
	public SxtArrayList2(int cap){
		ele = new Object[cap];
	}
	
}
