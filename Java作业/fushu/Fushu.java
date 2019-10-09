package fushu;

/*
 * 复数： x = a + b*i, y = c + d*i
 * 复数的加法： z = x + y = (a + c) + (b + d)i
 * 复数的减法： z = x - y = (a - c) + (b - d)i
 * 复数的乘法： z = x * y = (a*c - b*d) + (b*c + a*d)i
 * 复数的除法： z = x / y = ((a*c + b*d) / (c^2 + d^2)) + ((b*c - a*d) / (c^2 + d^2))i
 * 实数可以视为虚部为0的复数
 */

public class Fushu {

	//显示x
	public String showInfo(float a, float b) {
		if(b == 0) {
			return a + "";//a是float类型， 所以带上" "变成String
		}else {
		return a + "+" + b + "i";
		}
	}
	
	//复数的加法： z = x + y = (a + c) + (b + d)i
	public void fushuAdd(float a, float b, float c, float d) {
		float e;
		float f;
		e = a + c;
		f = b + d;
		if(f > 0) {
			System.out.println("z = " + e + "+" + f + "i");
		}else if(f == 0) {
			System.out.println("z = " + e);//如果复数的虚部等于0， 则只输出实部
		}else {
			System.out.println("z = " + e + f + "i");//如果复数的虚部小于0， 则输出实部和虚部
		}
	}
	
	//复数的减法： z = x - y = (a - c) + (b - d)i
	public void fushuSub(float a, float b, float c, float d) {
		float e;
		float f;
		e = a - c;
		f = b - d;
		if(f > 0) {
			System.out.println("z = " + e + "+" + f + "i");
		}else if(f == 0) {
			System.out.println("z = " + e);
		}else {
			System.out.println("z = " + e + f + "i");
		}
	}
	
	//复数的除法： z = x / y = ((a*c + b*d) / (c^2 + d^2)) + ((b*c - a*d) / (c^2 + d^2))i
	public void fushuDiv(float a, float b, float c, float d) {
		float e;
		float f;
		e = (a*c + b*d) / (c*c + d*d);
		f = (b*c - a*d) / (c*c + d*d);
		if(f > 0) {
			System.out.println("z = " + e + "+" + f + "i");
		}else if(f == 0) {
			System.out.println("z = " + e);
		}else {
			System.out.println("z = " + e + f + "i");
		}
	}
	
	//复数的乘法： z = x * y = (a*c - b*d) + (b*c + a*d)i
	public void fushuMul(float a, float b, float c, float d) {
		float e;
		float f;
		e = a*c - b*d;
		f = b*c + a*d;
		if(f > 0) {
			System.out.println("z = " + e + "+" + f + "i");
		}else if(f == 0) {
			System.out.println("z = " + e);
		}else {
			System.out.println("z = " + e + f + "i");
		}
	}
}
