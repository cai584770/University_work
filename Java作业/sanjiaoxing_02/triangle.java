package sanjiaoxing_02;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {
		Scanner side1 = new Scanner(System.in);
		Scanner side2 = new Scanner(System.in);
		Scanner side3 = new Scanner(System.in);
		boolean a = true;
		while(a) {
			System.out.println("第一条边为：");
			Double s1 = side1.nextDouble();
			System.out.println("第二条边为：");
			Double s2 = side2.nextDouble();
			System.out.println("第三条边为：");
			Double s3 = side2.nextDouble();
			Judge j = new Judge();
			a = j.judge(s1, s2, s3);
			Area s = new Area();
			double S = s.area(s1, s2, s3);
			if(!a) {
				System.out.println("面积为:"  + S);
			}
		}
	}
}
