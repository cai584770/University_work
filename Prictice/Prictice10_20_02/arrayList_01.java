package Prictice10_20_02;

public class arrayList_01 {
	public static void main(String[] args) {
		sxtArrayList s1 = new sxtArrayList();
		s1.add("??");
		s1.add("..");
		s1.add("..");
		System.out.println(s1);
		
	}
}

class sxtArrayList<E>{
	private Object[] ele;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public sxtArrayList(){
		ele = new Object[DEFALT_CAPACITY];
	}
	
	public void add(E e) {
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
	
	
	public sxtArrayList(int cap){
		ele = new Object[cap];
	}
	
}
