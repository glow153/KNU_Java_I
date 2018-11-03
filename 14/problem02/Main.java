package practice_14th_week.problem02;

public class Main {
	public static void main(String[] args) {
		StringFinder sf = new StringFinder();
		while(sf.isRunning()) {
			sf.menu();
		}
	}
}
