package practice_12th_week.problem02;

public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(String name, double side1, double side2, double side3) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	protected void calcArea() {
		double s = (side1 + side2 + side3) / 2;
		super.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	@Override
	protected void calcPeriphery() {
		super.periphery = side1 + side2 + side3;
	}
}
