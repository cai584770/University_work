package Prictice10_20_02;

public class arrayList_02 {
	public static void main(String[] args) {
		SxtArrayList1 s1 = new SxtArrayList1();
		for (int i = 0; i < 40; i++) {
			s1.add("?" + i);
		}
		System.out.println(s1);
		
	}
}

class SxtArrayList1<E>{
	private Object[] ele;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public SxtArrayList1(){
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
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < size; i++) {
			s.append(ele[i] + " ");
		}
		s.setCharAt(s.length()-1, ']');
		
		return s.toString();
		
	}
	
	public SxtArrayList1(int cap){
		ele = new Object[cap];
	}
	
}
