package practice_9th_week.problem03_old_old;

import java.util.Scanner;

public class Arbeit {
	private Scanner sc;
	private OrderSheet orderSheet;
	
	public Arbeit() {
		sc = new Scanner(System.in);
	}
	
	public void takeOrder() {
		Beverage[] beverageList = new Beverage[6];
		
		System.out.println("�ȳ��ϼ���! Cloud 9 �Դϴ�~");
		
		for(int i = 0; i < beverageList.length; i++) {
			System.out.print("�ֹ��Ͻ� ���Ḧ �Է��ϼ��� : ");
			String input = sc.nextLine();
			if (input.equals("-1"))
				break;
			String[] bevinfo = input.split(" ");
			
			if(bevinfo.length == 2) {
				beverageList[i] = new Beverage(bevinfo[0], Integer.parseInt(bevinfo[1]));
			} else if(bevinfo.length == 3) {
				beverageList[i] = new Beverage(true, bevinfo[1], Integer.parseInt(bevinfo[2]));
			} else {
				System.out.println("�߸� �ֹ��ϼ̽��ϴ�.");
				i -= 1;
			}
		}
		
		orderSheet = new OrderSheet(beverageList);
	}
	
	public void pay() {
		System.out.println("�� �ݾ��� " + orderSheet.getTotalAmount() + "�� �Դϴ�.");
		System.out.println("���� ����Ʈ�� " + orderSheet.getMileage() + "point �Դϴ�.");
	}
}
