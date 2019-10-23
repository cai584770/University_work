package sanjiaoxing_03;

import java.util.Scanner;

public class triangle_03 {

	public static void main(String[] args) {
		System.out.print("请输入需要创建的三角形个数：");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		Triangle[] t = new Triangle[size];
		for (int i = 0; i < size; i++) {
			t[i] = new Triangle();
			t[i].triangle();
		}
//		t[0] = new Triangle();
//		t[1] = new Triangle();
//		t[0].triangle();
//		t[1].triangle();
	}
}

class Triangle{
	public void triangle(){
		double s1, s2, s3;
		Scanner side = new Scanner(System.in);
		Triangle t = new Triangle();
		System.out.print("第一条边为：");
		s1 = side.nextDouble();
		System.out.print("第二条边为：");
		s2 = side.nextDouble();
		System.out.print("第三条边为：");
		s3 = side.nextDouble();
		if(t.judge(s1, s2, s3)) {
			System.out.println("请输入正确的三边！");
		}else {
			System.out.println("面积为：" + t.area(s1, s2, s3) +"\n" + "周长为:" + t.perimeter(s1, s2, s3));
		}
	}

	public double area(double side1, double side2, double side3) {
		double a;
		double p;
		double b;
		p = (side1 + side2 + side3) / 2;
		b = p*(p - side1)*(p - side2)*(p - side3);
		a = Math.sqrt(b);
		return a;
	}
	
	public double perimeter(double side1, double side2, double side3) {
		double L;
		L = side1 + side2 + side3;
		return L;
	}
	
	public Boolean judge(double side1, double side2, double side3) {
		double a1 = side1+side2;
		double a2 = side1+side3;
		double a3 = side3+side2;
		double a4 = Math.abs(side1-side2);
		double a5 = Math.abs(side1-side3);
		double a6 = Math.abs(side3-side2);
		if(a1<=side3 || a2<=side2 || a3<=side1 || 
		   a4>=side3 || a5>=side2 || a6>=side1) {
			return true;
		}else {
			return false;
		}
	}
}
