package fushu;

public class Test {
	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		int c = 4;
		int d = 7;
		
		//��ʾ����
		Fushu x = new Fushu();
		Fushu y = new Fushu();
		System.out.println("x = " + x.showInfo(a, b));
		System.out.println("y = " + y.showInfo(c, d));
		//�����ļӷ�
		Fushu z = new Fushu();
		z.fushuAdd(a,b,c,d);
		
		//�����ļ���
		z.fushuSub(a, b, c, d);
		
		//�����ĳ���
		z.fushuDiv(a, b, c, d);
		
		//�����ĳ˷�
		z.fushuMul(a, b, c, d);
	}
}
