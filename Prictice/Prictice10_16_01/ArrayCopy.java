package LiTi03;

public class ArrayCopy {

	public static void main(String[] args) {
//		testCopy1();
//		System.out.println("###########");
//		testCopy2();
		
		String[] s1 = {"ss", "sss", "sq", "sqwe","qwe"};
		
		testDel(s1, 3);
		
		
	}
	
	public static void testCopy1() {
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[10];
		System.arraycopy(s1, 0, s2, 5, 5);
	
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}
	
	public static void testCopy2(){
		String[] s1 = {"aa", "bb", "cc", "dd", "ee"};
		String[] s2 = new String[5];
		System.arraycopy(s1, 3, s2, 2, s1.length-3);
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}
	
	public static String[] testDel(String[] s, int index) {
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		s[s.length-1]=null;
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		return s;
	}

	
}
