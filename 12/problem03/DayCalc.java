package practice_12th_week.problem03;

import java.util.Calendar;
import java.util.Scanner;

public class DayCalc {
	private Scanner sc;
	private Calendar cal;
	
	public DayCalc() {
		sc = new Scanner(System.in);
		cal = Calendar.getInstance();
	}
	
	public void menu() {
		while(true) {
			System.out.print("1. 전역일 계산기 , 2. 기념일 계산기, 3. 종료 // 입력 : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				calcDischargeDay();
			} else if(mode == 2) {
				calcAnniversary();
			} else if(mode == 3) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	private String dateformatter(Calendar calendar) {
		String dow = "";
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			dow = "일";
			break;
		case Calendar.MONDAY:
			dow = "월";
			break;
		case Calendar.TUESDAY:
			dow = "화";
			break;
		case Calendar.WEDNESDAY:
			dow = "수";
			break;
		case Calendar.THURSDAY:
			dow = "목";
			break;
		case Calendar.FRIDAY:
			dow = "금";
			break;
		case Calendar.SATURDAY:
			dow = "토";
			break;
		}
		return calendar.get(Calendar.YEAR) + "년 "
			+ calendar.get(Calendar.MONTH) + "월 "
			+ calendar.get(Calendar.DAY_OF_MONTH) + "일 "
			+ dow + "요일";
	}
	
	public void calcDischargeDay() {
		long lstart = 0L, lend = 0L;
		int daydelta = 0;
		
		System.out.print("오늘 날짜 입력 (형식 : yyyy-MM-dd) : ");
		String[] start = sc.nextLine().split("-");
		System.out.print("전역일 날짜 입력 (형식 : yyyy-MM-dd) : ");
		String[] end = sc.nextLine().split("-");
		
		cal.set(Calendar.YEAR, Integer.parseInt(start[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(start[1]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(start[2]));
		lstart = cal.getTimeInMillis();
		
		cal.set(Calendar.YEAR, Integer.parseInt(end[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(end[1]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(end[2]));
		lend = cal.getTimeInMillis();
		
		daydelta = (int)((lend - lstart) / (24 * 60 * 60 * 1000L)) - 1;

		System.out.println("전역일(" + dateformatter(cal) + ")까지 " + daydelta + "일 남았습니다.");
	}
	
	public void calcAnniversary() {
		System.out.print("기준 날짜 입력 (형식 : yyyy-MM-dd) : ");
		String[] start = sc.nextLine().split("-");
		System.out.print("며칠 이후? : ");
		int delta = sc.nextInt();
		sc.nextLine();
		
		cal.set(Calendar.YEAR, Integer.parseInt(start[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(start[1]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(start[2]));
		
		cal.add(Calendar.DAY_OF_MONTH, delta-1);
		
		System.out.println("D+" + delta + " 기념일은 " + dateformatter(cal) + "입니다.");
	}
}
