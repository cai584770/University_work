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

	Image feiji = GameUtil.getImage("images/feiji.png"); // 加载飞机
	Image bg = GameUtil.getImage("images/bg.png"); // 加载背景
	Plane plane = new Plane(feiji, 240, 600); // 飞机初始位置
	ArrayList<Shell> shells = new ArrayList<Shell>(); // 子弹数组
	Boom b; // 飞机爆炸
	Date startTime = new Date(); // 开始时间
	Date endTime;	// 结束时间
	int period;		// 游戏时间
	
	// 画出飞机、子弹
	public void paint(Graphics g) {
		super.paint(g);
		Color c = g.getColor(); 
		g.drawImage(bg, 0, 0, null);// 画背景
		plane.drawSelf(g); // 画飞机

		//画出炮弹
		for (int i = 0; i < shells.size(); i++) {
			Shell s = shells.get(i); // 子弹 
			s.draw(g); // 画子弹
			// 判断子弹是否和飞机碰撞
			boolean p = s.getRect().intersects(plane.getRect());
			if(p) {
				plane.live = false;
				if(b == null) {
					// 爆炸图片轮播
					b = new Boom(plane.x, plane.y);
					// 计算游戏时间
					endTime = new Date(); // 结束时间
					period = (int)((endTime.getTime() - startTime.getTime())/1000);
				}
				b.draw(g);
			}
			// 输出游戏时长
			if(!plane.live) {
				g.setColor(Color.red);
				Font f = new Font("宋体", Font.BOLD, 50);
				g.setFont(f);
				g.drawString("时间:"+ period + "S", 150, (int)plane.y);
			}
		}
		// 将颜色还原
		g.setColor(c);
	}
	
	//双缓冲技术
	private Image offScreenImage = null;
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(480,700);//这是游戏窗口的宽度和高度
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}  
	
	class PaintThread extends Thread{
		public void run() {
			while(true) {
				repaint();//重画
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//定义键盘监听
	class KeyMonitor extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
	}
	
	//初始化窗口
	public void launchFrame() {
		this.setTitle("飞机躲子弹"); // 标题
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
		
		// 增加子弹
		for (int i = 0; i < 30; i++) {
			Shell b = new Shell();
			shells.add(b);
		}
	}
	
}
