package fushu;

public class Test {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		int c = 4;
		int d = 7;
		
		//显示复数
		Fushu x = new Fushu();
		Fushu y = new Fushu();
		System.out.println("x = " + x.showInfo(a, b));
		System.out.println("y = " + y.showInfo(c, d));
		//复数的加法
		Fushu z = new Fushu();
		z.fushuAdd(a,b,c,d);
		
		//复数的减法
		z.fushuSub(a, b, c, d);
		
		//复数的除法
		z.fushuDiv(a, b, c, d);
		
		//复数的乘法
		z.fushuMul(a, b, c, d);
	}
}
