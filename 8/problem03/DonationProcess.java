package practice_8th_week.problem03;

import java.util.Scanner;

public class DonationProcess {
	private Scanner sc = null;
	private Donator donator = null;
	private Recipient recipient = null;
	private int count = 0;
	
	public void initialize() {
		sc = new Scanner(System.in);
		donator = new Donator();
		recipient = new Recipient();
	}
	
	public void process() {
		System.out.print("기부금 목표액을 입력하세요 : ");
		DonationCenter.goal = sc.nextInt();
		
		while(true) {
			count++;
			System.out.print(count + "회차 기부금을 입력하세요 : ");
			if(!donator.donate(sc.nextInt())) {
				count--;
				continue;
			}
			if (DonationCenter.donation > DonationCenter.goal)
				break;
			recipient.receipt();
			System.out.println("후원금 총액 : " + DonationCenter.donation + "만원");
		}
		System.out.println("목표액이 달성되었습니다! 총액 : " + DonationCenter.donation + "만원");
		System.out.println("총 " + count + "회 기부하셨습니다.");
		sc.close();
	}
}
