package practice_11th_week.problem01;

public class WeaponStore {
	private Staff cane;
	private Sword sword;
	private Hammer hammer;
	
	public WeaponStore() {
		cane = new Staff("���� ������", 8, 150);
		sword = new Sword("��ö ��", 25, 500);
		hammer = new Hammer("���� ��ġ", 30, 600);
	}
	
	public void showItems() { 
		cane.info();
		sword.info();
		hammer.info();
	}
}
