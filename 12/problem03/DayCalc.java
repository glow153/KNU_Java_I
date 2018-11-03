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
			System.out.print("1. ������ ���� , 2. ����� ����, 3. ���� // �Է� : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				calcDischargeDay();
			} else if(mode == 2) {
				calcAnniversary();
			} else if(mode == 3) {
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	private String dateformatter(Calendar calendar) {
		String dow = "";
		switch(calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			dow = "��";
			break;
		case Calendar.MONDAY:
			dow = "��";
			break;
		case Calendar.TUESDAY:
			dow = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			dow = "��";
			break;
		case Calendar.THURSDAY:
			dow = "��";
			break;
		case Calendar.FRIDAY:
			dow = "��";
			break;
		case Calendar.SATURDAY:
			dow = "��";
			break;
		}
		return calendar.get(Calendar.YEAR) + "�� "
			+ calendar.get(Calendar.MONTH) + "�� "
			+ calendar.get(Calendar.DAY_OF_MONTH) + "�� "
			+ dow + "����";
	}
	
	public void calcDischargeDay() {
		long lstart = 0L, lend = 0L;
		int daydelta = 0;
		
		System.out.print("���� ��¥ �Է� (���� : yyyy-MM-dd) : ");
		String[] start = sc.nextLine().split("-");
		System.out.print("������ ��¥ �Է� (���� : yyyy-MM-dd) : ");
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

		System.out.println("������(" + dateformatter(cal) + ")���� " + daydelta + "�� ���ҽ��ϴ�.");
	}
	
	public void calcAnniversary() {
		System.out.print("���� ��¥ �Է� (���� : yyyy-MM-dd) : ");
		String[] start = sc.nextLine().split("-");
		System.out.print("��ĥ ����? : ");
		int delta = sc.nextInt();
		sc.nextLine();
		
		cal.set(Calendar.YEAR, Integer.parseInt(start[0]));
		cal.set(Calendar.MONTH, Integer.parseInt(start[1]));
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(start[2]));
		
		cal.add(Calendar.DAY_OF_MONTH, delta-1);
		
		System.out.println("D+" + delta + " ������� " + dateformatter(cal) + "�Դϴ�.");
	}
}
