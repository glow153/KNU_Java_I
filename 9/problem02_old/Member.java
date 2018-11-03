package practice_9th_week.problem02_old;

public class Member {
	private long id;
	private String name;
	private int mileage;
	public Member(long id, String name, int mileage) {
		this.id = id;
		this.name = name;
		this.mileage = mileage;
	}
	public Member(long id, String name) {
		this.id = id;
		this.name = name;
		mileage = 0;
	}
	public Member(long id) {
		this.id = id;
		name = "(none)";
		mileage = 0;
	}
	public String getName() {
		return name;
	}
	public long getId() {
		return id;
	}
	public int getMileage() {
		return mileage;
	}
	public void set(long id) {
		this.id = id;
	}
	public void set(String name) {
		this.name = name;
	}
	public void set(int mileage) {
		this.mileage = mileage;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id);
		sb.append("\t");
		sb.append(name);
		int tabCount = 2 - name.length() / 8;
		if (tabCount < 0)
			tabCount = 0;
		for(int i=0;i<tabCount;i++)
			sb.append("\t");
		sb.append(mileage);
		return sb.toString();
	}
}
	