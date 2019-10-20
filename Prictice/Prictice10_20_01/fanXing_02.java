package Prictice10_20_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fanXing_02 {
	public static void main(String[] args) {
//		List list = new ArrayList();
//		Map map = new HashMap();
		
		Collection<String> c = new ArrayList<>() ;
		c.size();
		
		c.add("111");
		c.add("???");
		System.out.println(c);
		System.out.println(c.size());
		
		Object[] obj = c.toArray();
		System.out.println(obj);
		
		c.remove("???");
		System.out.println(c);
		
		c.clear();
		System.out.println(c);
		
		
	
		
	}
}
