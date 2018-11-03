package practice_10th_week.problem02;

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
	public Member(long id, int mileage) {
		this.id = id;
		name = "(none)";
		this.mileage = mileage;
	}
	public Member(long id) {
		this.id = id;
		name = "(none)";
		mileage = 0;
	}
	public long getId() {
		return id;
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
		sb.append("")
		  .append(id)
		  .append("\t")
		  .append(name)
		  .append("\t\t")
		  .append(mileage);
		return sb.toString();
	}
}
	