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
		System.out.println("���� �̸� : " + name);
		System.out.println("���ط� : " + damage);
		System.out.println("���� : " + price);
		System.out.println("-----------------------");
	}
}
