package practice_13th_week.problem03;

import java.util.Random;

import practice_13th_week.problem03.api.Item;
import practice_13th_week.problem03.api.ItemFactory;
import practice_13th_week.problem03.concrete.WeaponFactory;

public class ItemCreator {
	private Item[] item;
	private ItemFactory factory;
	private Random rand;
	
	public ItemCreator() {
		item = new Item[5];
		factory = new WeaponFactory();
		rand = new Random();
	}
	
	public void create() {
		for (int i = 0; i < item.length; i++)
			item[i] = factory.newInstance(rand.nextInt(3));
	}
	
	public void print() {
		String s = "";
		for (int i = 0; i < item.length; i++)
			s += item[i].getName() + ",";
		System.out.println("생성된 아이템은 " + s + " 입니다.");
	}
}
