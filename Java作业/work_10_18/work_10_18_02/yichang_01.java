package work_10_18_02;

import java.util.Scanner;

public class yichang_01 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,ArithmeticException {
		
		try {
			int[] a = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("输入除数：");
			int b = sc.nextInt();
			System.out.println("输入被除数：");
			int c = sc.nextInt();
			int d = b / c;
			System.out.println("请输入数组索引：");
			int e = sc.nextInt();
			System.out.println(a[e]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常：" + e);
		} catch (ArithmeticException e) {
			System.out.println("被除数为0异常：" + e);
		}finally{
			System.out.println("#####");
		}
	}
}
