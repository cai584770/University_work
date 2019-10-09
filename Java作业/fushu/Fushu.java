package fushu;

/*
 * ������ x = a + b*i, y = c + d*i
 * �����ļӷ��� z = x + y = (a + c) + (b + d)i
 * �����ļ����� z = x - y = (a - c) + (b - d)i
 * �����ĳ˷��� z = x * y = (a*c - b*d) + (b*c + a*d)i
 * �����ĳ����� z = x / y = ((a*c + b*d) / (c^2 + d^2)) + ((b*c - a*d) / (c^2 + d^2))i
 * ʵ��������Ϊ�鲿Ϊ0�ĸ���
 */

public class Fushu {

	//��ʾx
	public String showInfo(float a, float b) {
		if(b == 0) {
			return a + "";//a��float���ͣ� ���Դ���" "���String
		}else {
		return a + "+" + b + "i";
		}
	}
	
	//�����ļӷ��� z = x + y = (a + c) + (b + d)i
	public void fushuAdd(float a, float b, float c, float d) {
		float e;
		float f;
		e = a + c;
		f = b + d;
		if(f > 0) {
			System.out.println("z = " + e + "+" + f + "i");
		}else if(f == 0) {
			System.out.println("z = " + e);//����������鲿����0�� ��ֻ���ʵ��
		}else {
			System.out.println("z = " + e + f + "i");//����������鲿С��0�� �����ʵ�����鲿
		}
	}
	
	//�����ļ����� z = x - y = (a - c) + (b - d)i
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
	
	//�����ĳ����� z = x / y = ((a*c + b*d) / (c^2 + d^2)) + ((b*c - a*d) / (c^2 + d^2))i
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
	
	//�����ĳ˷��� z = x * y = (a*c - b*d) + (b*c + a*d)i
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
