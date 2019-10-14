package Prictice10_12_01;

/*
 * 子弹类
 * 控制子弹飞行方向、颜色等
 */

import java.awt.Color;
import java.awt.Graphics;

public class Shell extends GameObject {

	double degree;
	
	
	public Shell() {
		degree = Math.random()*Math.PI*2;
		x = 240;
		y = 200;
		width = 10;
		height = 10;
		speed = 3;
	}
	
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.YELLOW);
		
		g.fillOval((int)x, (int)y, (int)width, (int)height);
		
		//炮弹沿任意方向飞行
		x += speed*Math.cos(degree);
		y += speed*Math.sin(degree);
		
		//炮弹反弹
		if(x<0 || x>Constant.GAME_WIDTH - width * 2) {
			degree = Math.PI - degree;
		}
		
		if(y<30 || y>Constant.GAME_HEIGHT - height * 2) {
			degree = -degree;
		}
		
		g.setColor(c);
	}
	
}
