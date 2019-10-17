package Prictice10_17_01;

import java.util.Arrays;

public class erfenfa {
	public static void main(String[] args) {
		int[] a = {15, 14, 8, 6, 5, 4, 3, 2};
		Arrays.sort(a);
		System.out.println(search_1(a, 15));
		
	}
	
	public static int search_1(int[] a, int value) {
		int low = 0;
		int high = a.length-1;
		
		while (low <= high) {
			int mid = (low+high)/2;
			if (value == a[mid] ) {
				return mid;
			}
			
			if(value > a[mid]) {
				low = mid + 1;
			}
			
			if(value < a[mid]) {
				high = mid - 1;
			}
		}
	
		return -1;
	}
}
