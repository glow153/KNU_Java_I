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
		
		System.out.println("안녕하세요! Cloud 9 입니다~");
		
		for(int i = 0; i < beverageList.length; i++) {
			System.out.print("주문하실 음료를 입력하세요 : ");
			String input = sc.nextLine();
			if (input.equals("-1"))
				break;
			String[] bevinfo = input.split(" ");
			
			if(bevinfo.length == 2) {
				beverageList[i] = new Beverage(bevinfo[0], Integer.parseInt(bevinfo[1]));
			} else if(bevinfo.length == 3) {
				beverageList[i] = new Beverage(true, bevinfo[1], Integer.parseInt(bevinfo[2]));
			} else {
				System.out.println("잘못 주문하셨습니다.");
				i -= 1;
			}
		}
		
		orderSheet = new OrderSheet(beverageList);
	}
	
	public void pay() {
		System.out.println("총 금액은 " + orderSheet.getTotalAmount() + "원 입니다.");
		System.out.println("적립 포인트는 " + orderSheet.getMileage() + "point 입니다.");
	}
}
