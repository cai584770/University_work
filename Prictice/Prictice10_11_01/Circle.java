package Prictice10_11_01;

public class Circle implements Shape{
	
	private double R;
	
	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*R*R;
	}

}
