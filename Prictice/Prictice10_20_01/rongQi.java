package Prictice10_20_01;

import java.util.ArrayList;
import java.util.Collection;

public class rongQi {

	public static void main(String[] args) {
		Collection<String> a = new ArrayList<>();
		Collection<String> b = new ArrayList<>();
		boolean c ;
		a.add("1");
		a.add("2");
		a.add("3");
		b.add("3");
		b.add("4");
		b.add("5");
		System.out.println(a);
		System.out.println(b);
		System.out.println("###");
		a.addAll(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println("###");
		a.removeAll(b);
		System.out.println(a);
		System.out.println(b);
		c = a.retainAll(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("###");
		
	}
}