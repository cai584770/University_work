/*
	5��Ѫƿ	
	��һƿѪ����һ��
	һ����һ��Ѫ
	�����֮�����һ��Ѫ���ô���
	��Ů����ʼʱѪ��
	�˺�����Ϊ5

	��֪Ů����ʼѪ��hp = x
					hp = hp * 2 - 1   --> ���ƿɵó�ʼѪ��
*/
package Jungle;

public class jungle {
	public static void main(String[] args) {
		float hp, hit;//Ѫ��, ����������
		float last;//���Ѫ��
		
		last = 0;
		hp = 0;
		
		for(hit = 5; hit > 0; hit--) {
			last += 1;
			hp = last / 2;
			last = hp;
		}
		
		System.out.println("Ů����ʼhpΪ:" + hp);
	}
}
