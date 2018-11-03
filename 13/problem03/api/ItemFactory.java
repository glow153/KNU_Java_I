package practice_13th_week.problem03.api;

public abstract class ItemFactory {
	protected abstract void printLog(int type);
	protected abstract Item createItem(int type);
	
	public Item newInstance(int type) {
		Item item;
		printLog(type);
		item = createItem(type);
		return item;
	}
}
