package Prictice10_17_01;

import java.util.Arrays;

/*
 *√∞≈›≈≈–Ú∑® 
 */

public class maopao {
	public static void main(String[] args) {
		int[] a = {3, 14, 5, 6, 8, 2, 4, 15};
		int temp = 0;
		
		for (int j = 0; j < a.length-1; j++) {
			boolean flag = true;
			for (int i = 0; i < a.length-1-j; i++) {
				if(a[i] < a[i+1]){
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					
					System.out.println(Arrays.toString(a));
					flag = false;
				}
			}
			if(flag) {
				System.out.println("Ω· ¯");
				break;
			}
			System.out.println("===========");
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
		
	}
}
