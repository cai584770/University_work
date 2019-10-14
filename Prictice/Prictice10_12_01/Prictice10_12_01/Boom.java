package Prictice10_12_01;

/*
 * 子弹爆炸类
 * 将子弹爆炸后的图片进行轮播
 */

import java.awt.Graphics;
import java.awt.Image;

public class Boom {
	double x, y;
	static Image[] imgs = new Image[3]; // 创建数组， 保存三张图片
	static {
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = GameUtil.getImage("images/destroy" 
					+ (i+1) + ".png"); // 获得三张图片的位置
			imgs[i].getWidth(null); 
		}
	}
	
	int count = 0;
	
	public void draw(Graphics g) {
		if(count < 3) {
			g.drawImage(imgs[count], (int)x, (int)y, null); // 画出三张图片
			count++;
		}
	}
	
	public Boom(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}
