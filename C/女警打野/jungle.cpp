/*
	5个血瓶	
	喝一瓶血量加一倍
	一巴掌一滴血
	五巴掌之后最后一滴血正好打死
	求女警开始时血量
	伤害总数为5

	已知女警初始血量hp = x
					hp = hp * 2 - 1   --> 逆推可得初始血量
*/
#include<stdio.h>

int main()
{
	float hp, hit;
	float last;

	last = 0;
	hp = 0;//最后的血量

	for (hit = 0; hit < 5; hit++)
	{
		last = last + 1;
		hp = last / 2;
		last = hp;
	}
	printf("hp = %lf", hp);

	return 0;
}