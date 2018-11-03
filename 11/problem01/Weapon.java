package practice_11th_week.problem01;

public class Weapon {
	private String name;
	private int damage;
	private int price;
	protected Weapon(String name, int damage, int price) {
		this.name = name;
		this.damage = damage;
		this.price = price;
	}
	public final void info() {
		System.out.println("-----------------------");
		System.out.println("무기 이름 : " + name);
		System.out.println("피해량 : " + damage);
		System.out.println("가격 : " + price);
		System.out.println("-----------------------");
	}
}
