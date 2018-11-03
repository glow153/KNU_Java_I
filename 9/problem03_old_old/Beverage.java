package practice_9th_week.problem03_old_old;

public class Beverage {
	private String type;
	private int count;
	private boolean ice;
	
	public Beverage(boolean ice, String type, int count) {
		this.type = type;
		this.count = count;
		this.ice = ice;
	}
	
	public Beverage(String type, int count) {
		this.type = type;
		this.count = count;
		ice = false;
	}

	public String getType() {
		return type;
	}

	public int getCount() {
		return count;
	}

	public boolean isIce() {
		return ice;
	}
}
