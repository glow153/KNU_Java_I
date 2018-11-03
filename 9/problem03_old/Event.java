package practice_9th_week.problem03_old;

public class Event {
	private String date, hour, minute;
	private String eventName;
	
	public Event(String date, String hour, String minute, String eventName) {
		this.date = date;
		this.hour = hour;
		this.minute = minute;
		this.eventName = eventName;
	}
	public Event(String date, String eventName) {
		this.date = date;
		this.hour = null;
		this.minute = null;
		this.eventName = eventName;
	}
	
	public String getDate() {
		return date;
	}
	public String getHour() {
		return hour;
	}
	public String getMinute() {
		return minute;
	}
	public String getEventName() {
		return eventName;
	}
}
