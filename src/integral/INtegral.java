/*
 * ��f = x * x������[1,2]�ϵĶ�����,���������Ϊ100000
 */
package integral;

public class INtegral {
	public static void main(String args[]) {
		float f, x;
		float a, b;
		float m, n;
		float sum = 0;
		float i = 1;
		
		a = 1;//��������
		b = 2;//��������
		n = 100000;//���������
		m = (b - a) / n;
		
		while (i <= n) {
			x = a + i *m;
			f = x * x;
			sum = sum + f * m;
			i++;
		}
			
		System.out.println("f������[1,2]�ϵĶ�����Ϊ:"+ sum);
	}
}
