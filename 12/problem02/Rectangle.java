package practice_12th_week.problem02;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	@Override
	protected void calcArea() {
		super.area = width * height;
	}
	
	@Override
	protected void calcPeriphery() {
		super.periphery = 2 * (width + height);
	}
}
