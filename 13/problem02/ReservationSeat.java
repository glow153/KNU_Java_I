package practice_13th_week.problem02;

import java.util.Scanner;

public class ReservationSeat {
	private Scanner sc = null;
	private boolean isRun = true;
	private Theater theater;
	
	public ReservationSeat() {
		sc = new Scanner(System.in);
		System.out.println("=== �¼� ���� ���α׷� ===");
	}
	
	public void menu() {
		System.out.println("1. ��ȭ�� ����");
		System.out.println("2. �¼� ����");
		System.out.println("3. �¼� Ȯ��");
		System.out.println("4. ����");
		System.out.print("�޴��� ������ �ּ��� : ");
		
		switch (sc.nextInt()) {
			case 1:
				choiceTheater();
				break;
			case 2:
				if (theater != null)
					reserve();
				else
					System.out.println("��ȭ���� ���� �������ּ���.");
				break;
			case 3:
				theater.checkSeat();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				isRun = false;
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
	}
	
	private void choiceTheater() {
		System.out.println("1. �߿츮�ó׸�  2.�ް��ڽ�  3.CGV");
		System.out.print("��ȭ���� �������ּ��� : ");
		
		switch(sc.nextInt()) {
			case 1 :
				theater = new Megabox();
				break;
			case 2 :
				theater = new CGV();
				break;
			case 3 :
				theater = new Yawoori();
				break;	
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
		}
	}
	
	private void reserve() {
		theater.printWelcome();
		sc.nextLine();
		System.out.print("�¼��� ������ �ּ���.(A-C,1-5) : ");
		String[] strArr = sc.nextLine().split(",");
		theater.reserveSeat(strArr[0].charAt(0), Integer.parseInt(strArr[1])-1);
	}
	
	public boolean isRunning() {
		return isRun;
	}
}
