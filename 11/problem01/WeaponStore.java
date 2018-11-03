package practice_11th_week.problem01;

public class WeaponStore {
	private Staff cane;
	private Sword sword;
	private Hammer hammer;
	
	public WeaponStore() {
		cane = new Staff("³ª¹« ÁöÆÎÀÌ", 8, 150);
		sword = new Sword("°­Ã¶ °Ë", 25, 500);
		hammer = new Hammer("¹«¼è ¸ÁÄ¡", 30, 600);
	}
	
	public void showItems() { 
		cane.info();
		sword.info();
		hammer.info();
	}
}
