package Prictice10_12_01;

/*
 * �ӵ���ը��
 * ���ӵ���ը���ͼƬ�����ֲ�
 */

import java.awt.Graphics;
import java.awt.Image;

public class Boom {
	double x, y;
	static Image[] imgs = new Image[3]; // �������飬 ��������ͼƬ
	static {
		for (int i = 0; i < imgs.length; i++) {
			imgs[i] = GameUtil.getImage("images/destroy" 
					+ (i+1) + ".png"); // �������ͼƬ��λ��
			imgs[i].getWidth(null); 
		}
	}
	
	int count = 0;
	
	public void draw(Graphics g) {
		if(count < 3) {
			g.drawImage(imgs[count], (int)x, (int)y, null); // ��������ͼƬ
			count++;
		}
	}
	
	public Boom(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
}
