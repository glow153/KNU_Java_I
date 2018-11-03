package practice_13th_week.problem02;

public class Main {
	public static void main(String[] args) {
		ReservationSeat rs = new ReservationSeat();
		while(rs.isRunning()) {
			rs.menu();
		}
	}
}
