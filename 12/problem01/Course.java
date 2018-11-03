package practice_12th_week.problem01;

public class Course {
	protected void appetizer() {}
	protected void mainDishes1() {}
	protected void mainDishes2() {}
	protected void dessert() {}
	
	public void startDinner() {
		appetizer();
		mainDishes1();
		mainDishes2();
		dessert();
	}
}
