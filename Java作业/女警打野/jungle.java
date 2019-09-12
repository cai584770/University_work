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
package Jungle;

public class jungle {
	public static void main(String[] args) {
		float hp, hit;//血量, 龙攻击次数
		float last;//最后血量
		
		last = 0;
		hp = 0;
		
		for(hit = 5; hit > 0; hit--) {
			last += 1;
			hp = last / 2;
			last = hp;
		}
		
		System.out.println("女警初始hp为:" + hp);
	}
}
