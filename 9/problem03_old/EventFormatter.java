package practice_9th_week.problem03_old;

public class EventFormatter {
	public static String format(Event event) {
		if (event.getHour() == null && event.getMinute() == null)
			return event.getDate() + ", "
				+ "�Ϸ����� / "
				+ "�̺�Ʈ��: " + event.getEventName();
		else
			return event.getDate() + " "
				+ event.getHour() + ":"
				+ event.getMinute() + " / "
				+ "�̺�Ʈ��: " + event.getEventName();
	}
}
