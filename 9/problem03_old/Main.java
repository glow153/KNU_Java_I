package practice_9th_week.problem03_old;

public class Main {
	public static void main(String[] args) {
		Event event1 = new Event("2018-05-12", "17", "00", "중학교 친구 결혼식");
		Event event2 = new Event("2018-05-13", "19", "30", "대학교 친구들과 저녁식사");
		Event event3 = new Event("2018-05-15", "스승의 날");
		Event event4 = new Event("2018-05-19", "500일♡");
		
		System.out.println(EventFormatter.format(event1));
		System.out.println(EventFormatter.format(event2));
		System.out.println(EventFormatter.format(event3));
		System.out.println(EventFormatter.format(event4));
	}
}
