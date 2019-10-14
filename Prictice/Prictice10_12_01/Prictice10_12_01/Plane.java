package Prictice10_12_01;

/*
 * �ɻ���
 * ���Ʒɻ�����������
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject{
	boolean left, up, right, down;
	boolean live = true;

	//����ɻ�����
	public void drawSelf(Graphics g) {
		if(live) {
			g.drawImage(img, (int)x, (int)y, null);
		
			if(left) {
				x -= speed;
			}
			if(right) {
				x += speed;
			}
			if(down) {
				y += speed;
			}
			if(up) {
				y -= speed;
			}
		}
		
	}
	
	public Plane(Image img, double x, double y) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = 3;
		this.width = img.getWidth(null);
		this.height = img.getHeight(null);
	}
	
	//���¼��� ���ӷ���
	public void addDirection(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
		left = true;
		break;
		case KeyEvent.VK_DOWN:
		down = true;
		break;
		case KeyEvent.VK_RIGHT:
		right = true;
		break;
		case KeyEvent.VK_UP:
		up = true;
		break;
		}
	}
	
	//���ٷ���
	public void minusDirection(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
		left = false;
		break;
		case KeyEvent.VK_DOWN:
		down = false;
		break;
		case KeyEvent.VK_RIGHT:
		right = false;
		break;
		case KeyEvent.VK_UP:
		up = false;
		break;
		}
	}
	
	public Plane(Image img, double x, double y, int speed) {
		super(img, x, y);
		this.speed = speed;
	}
	
}
