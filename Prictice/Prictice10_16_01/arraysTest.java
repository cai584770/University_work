package LiTi03;

import java.util.Arrays;

public class arraysTest {
	public static void main(String[] args) {
		int[] a = {10, 100, 7, 2,20, 30};
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(Arrays.binarySearch(a, 30));
	}
}
