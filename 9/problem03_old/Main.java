package practice_9th_week.problem03_old;

public class Main {
	public static void main(String[] args) {
		Event event1 = new Event("2018-05-12", "17", "00", "���б� ģ�� ��ȥ��");
		Event event2 = new Event("2018-05-13", "19", "30", "���б� ģ����� ����Ļ�");
		Event event3 = new Event("2018-05-15", "������ ��");
		Event event4 = new Event("2018-05-19", "500�Ϣ�");
		
		System.out.println(EventFormatter.format(event1));
		System.out.println(EventFormatter.format(event2));
		System.out.println(EventFormatter.format(event3));
		System.out.println(EventFormatter.format(event4));
	}
}
