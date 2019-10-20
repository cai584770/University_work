package Prictice10_20_01;

import java.util.ArrayList;
import java.util.List;

public class arrayList_01 {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		System.out.println(l1);
		
		l1.add(3, "e");
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		l1.set(2, "?");
		System.out.println(l1);
		
		System.out.println(l1.get(2));
		System.out.println(l1.indexOf("d"));
		System.out.println(l1.indexOf("c"));
		l1.add("d");
		System.out.println(l1);
		System.out.println(l1.lastIndexOf("d"));
		
	}
	
}
