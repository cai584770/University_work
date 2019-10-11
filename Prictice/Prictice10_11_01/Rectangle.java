package Prictice10_11_01;

public class Rectangle implements Shape{
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}

	public void setLong(double length,double width) {
		this.length = length;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
