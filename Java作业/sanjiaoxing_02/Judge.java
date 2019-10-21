package sanjiaoxing_02;

/*
 * 三角形任意两边之和小于第三边，任意两边之差大于第三边， 则抛出异常
 */

public class Judge {
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
