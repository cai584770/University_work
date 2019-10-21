package sanjiaoxing_02;

public class Area {
	public double area(double side1, double side2, double side3) {
		double a;
		double p;
		double b;
		p = (side1 + side2 + side3) / 2;
		b = p*(p - side1)*(p - side2)*(p - side3);
		a = Math.sqrt(b);
		return a;
	}
}
