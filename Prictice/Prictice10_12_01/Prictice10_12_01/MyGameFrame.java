package Prictice10_12_01;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class MyGameFrame extends Frame{
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}

	Image feiji = GameUtil.getImage("images/feiji.png"); // ���طɻ�
	Image bg = GameUtil.getImage("images/bg.png"); // ���ر���
	Plane plane = new Plane(feiji, 240, 600); // �ɻ���ʼλ��
	ArrayList<Shell> shells = new ArrayList<Shell>(); // �ӵ�����
	Boom b; // �ɻ���ը
	Date startTime = new Date(); // ��ʼʱ��
	Date endTime;	// ����ʱ��
	int period;		// ��Ϸʱ��
	
	// �����ɻ����ӵ�
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor(); 
		g.drawImage(bg, 0, 0, null);// ������
		plane.drawSelf(g); // ���ɻ�

		//�����ڵ�
		for (int i = 0; i < shells.size(); i++) {
			Shell s = shells.get(i); // �ӵ� 
			s.draw(g); // ���ӵ�
			// �ж��ӵ��Ƿ�ͷɻ���ײ
			boolean p = s.getRect().intersects(plane.getRect());
			if(p) {
				plane.live = false;
				if(b == null) {
					// ��ըͼƬ�ֲ�
					b = new Boom(plane.x, plane.y);
					// ������Ϸʱ��
					endTime = new Date(); // ����ʱ��
					period = (int)((endTime.getTime() - startTime.getTime())/1000);
				}
				b.draw(g);
			}
			// �����Ϸʱ��
			if(!plane.live) {
				g.setColor(Color.red);
				Font f = new Font("����", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("ʱ��:"+ period + "S", 150, (int)plane.y);
			}
		}
		// ����ɫ��ԭ
		g.setColor(c);
	}
	
	//˫���弼��
	private Image offScreenImage = null;
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(480,700);//������Ϸ���ڵĿ�Ⱥ͸߶�
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();//�ػ�
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//������̼���
	class KeyMonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	
	//��ʼ������
	public void launchFrame() {
		this.setTitle("�ɻ����ӵ�"); // ����
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(300, 300); 
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();
		addKeyListener(new KeyMonitor());
		
		// �����ӵ�
		for (int i = 0; i < 30; i++) {
			Shell b = new Shell();
			shells.add(b);
		}
	}
	
}
