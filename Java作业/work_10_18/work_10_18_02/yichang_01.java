package work_10_18_02;

import java.util.Scanner;

public class yichang_01 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,ArithmeticException {
		
		try {
			int[] a = new int[5];
			Scanner sc = new Scanner(System.in);
			System.out.println("���������");
			int b = sc.nextInt();
			System.out.println("���뱻������");
			int c = sc.nextInt();
			int d = b / c;
			System.out.println("����������������");
			int e = sc.nextInt();
			System.out.println(a[e]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣��" + e);
		} catch (ArithmeticException e) {
			System.out.println("������Ϊ0�쳣��" + e);
		}finally{
			System.out.println("#####");
		}
	}
}
