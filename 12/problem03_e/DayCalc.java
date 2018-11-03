package practice_12th_week.problem03_e;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayCalc {
	private Scanner sc;
	private Calendar cal;
	private SimpleDateFormat sdfInput;
	private SimpleDateFormat sdfOutput;
	
	public DayCalc() {
		sc = new Scanner(System.in);
		cal = Calendar.getInstance();
		
		sdfInput = new SimpleDateFormat("yyyy-MM-dd");
		sdfOutput = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
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
	
	public void calcDischargeDay() {
		
		Date ds = null, de = null;
		int daydelta = 0;
		
		System.out.print("���� ��¥ �Է� (���� : yyyy-MM-dd) : ");
		String start = sc.nextLine();
		System.out.print("������ ��¥ �Է� (���� : yyyy-MM-dd) : ");
		String end = sc.nextLine();
		
		try {
			ds = sdfInput.parse(start);
			de = sdfInput.parse(end);
			long delta = de.getTime() - ds.getTime();
			daydelta = (int) (delta / (long)(24 * 60 * 60 * 1000));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������(" + sdfOutput.format(de) + ")���� " + daydelta + "�� ���ҽ��ϴ�.");
	}
	
	public void calcAnniversary() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.print("���� ��¥ �Է� (���� : yyyy-MM-dd) : ");
		String start = sc.nextLine();
		System.out.print("��ĥ ����? : ");
		int delta = sc.nextInt();
		sc.nextLine();
		
		try {
			cal.setTime(sdf.parse(start));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cal.add(Calendar.DAY_OF_MONTH, delta);
		
		System.out.println("D+" + delta + " ������� " + sdfOutput.format(cal.getTime()) + "�Դϴ�.");
	}
}
