package practice_12th_week.problem02;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle("원_1", 3);
		Rectangle rect = new Rectangle("사각형_1", 4, 5);
		Triangle tri = new Triangle("삼각형_1", 3, 4, 5);
		circle.describe();
		rect.describe();
		tri.describe();
	}
}
