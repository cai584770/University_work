package Prictice10_15_01;

public class NeiBuLei {
	
	int age = 10;
	
	//�Ǿ�̬�ڲ���
	class feiJingTai{
		public void show() {
			System.out.println(age);
		}
	}
	
	static class jingTai{
		public void show1() {
//			System.out.println(age);  // ����ʹ�����������
			System.out.println("jtjtjtjtjtj");
		}
	}
	
	static void testNiMing(niMing n) {
		System.out.println("?????");
		n.show2();
	}
	
	public static void main(String[] args) {
		NeiBuLei n1 = new NeiBuLei(); // ��
		NeiBuLei.feiJingTai n2 = new NeiBuLei().new feiJingTai();// �Ǿ�̬�ڲ���
		NeiBuLei.jingTai n3 = new NeiBuLei.jingTai(); // ��̬�ڲ���
		NeiBuLei.testNiMing(new niMing() {
			@Override
			public void show2() {
				// TODO Auto-generated method stub
				System.out.println("111111111110");
			}
		});// �����ڲ���
		
		System.out.println(n1.age);
		n2.show();
		n3.show1();
	}
}

interface niMing{
	void show2();
}