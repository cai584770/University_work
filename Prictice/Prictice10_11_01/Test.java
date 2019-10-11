package Prictice10_11_01;

public class Test {

	public static void main(String[] args) {

	Object c[] = new Shape[10];
	double[] d = new double [10];
	
	c[0] = new Rectangle();
	c[1] = new Circle();
	c[2] = new Rectangle();
	c[3] = new Circle();
	c[4] = new Rectangle();
	c[5] = new Circle();
	c[6] = new Rectangle();
	c[7] = new Circle();
	c[8] = new Circle();
	c[9] = new Rectangle();
	
	((Rectangle) c[0]).setLong(1, 2);
	((Circle) c[1]).setR(1);
	((Rectangle) c[2]).setLong(2, 3);
	((Circle) c[3]).setR(2);
	((Rectangle) c[4]).setLong(3, 4);
	((Circle) c[5]).setR(3);
	((Rectangle) c[6]).setLong(4, 5);
	((Circle) c[7]).setR(4);
	((Circle) c[8]).setR(5);
	((Rectangle) c[9]).setLong(5, 6);
	
	for (int i = 0; i < 10; i++) {
		d[i] = ((Shape) c[i]).area();
		if(c[i] instanceof Rectangle) {
			System.out.println("方形的面积为：" + d[i]);
		}
		if(c[i] instanceof Circle) {
			System.out.println("圆的面积为：" + d[i]);
		}
	}
	}
}
