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
#include<stdio.h>

int main()
{
	float hp, hit;
	float last;

	last = 0;
	hp = 0;//����Ѫ��

	for (hit = 0; hit < 5; hit++)
	{
		last = last + 1;
		hp = last / 2;
		last = hp;
	}
	printf("hp = %lf", hp);

	return 0;
}