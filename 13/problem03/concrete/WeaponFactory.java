package practice_13th_week.problem03.concrete;

import practice_13th_week.problem03.api.Item;
import practice_13th_week.problem03.api.ItemFactory;

public class WeaponFactory extends ItemFactory {

	@Override
	protected void printLog(int type) {
		// TODO Auto-generated method stub
		System.out.print("log> »ı¼º : ");
		switch(type) {
		case 0:
			System.out.println("°Ë");
			break;
		case 1:
			System.out.println("ÁöÆÎÀÌ");
			break;
		case 2:
			System.out.println("¸ÁÄ¡");
			break;
		}
	}

	@Override
	protected Item createItem(int type) {
		// TODO Auto-generated method stub
		Item item = null;
		
		switch(type) {
		case 0:
			item = new Sword();
			break;
		case 1:
			item = new Staff();
			break;
		case 2:
			item = new Hammer();
			break;
		}
		
		return item;
	}
	
}
