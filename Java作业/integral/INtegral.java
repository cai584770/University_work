/*
 * 求f = x * x在区间[1,2]上的定积分,子区间个数为100000
 */
package integral;

public class INtegral {
	public static void main(String args[]) {
		float f, x;
		float a, b;
		float m, n;
		float sum = 0;
		float i = 1;
		
		a = 1;//积分下限
		b = 2;//积分上限
		n = 100000;//子区间个数
		m = (b - a) / n;
		
		while (i <= n) {
			x = a + i *m;
			f = x * x;
			sum = sum + f * m;
			i++;
		}
			
		System.out.println("f在区间[1,2]上的定积分为:"+ sum);
	}
}
