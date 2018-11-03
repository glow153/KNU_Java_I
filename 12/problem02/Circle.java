package practice_12th_week.problem02;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	protected void calcArea() {
		super.area = Math.PI * radius * radius;
	}
	
	@Override
	protected void calcPeriphery() {
		super.periphery = 2 * Math.PI * radius;
	}
}
