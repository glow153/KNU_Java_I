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
		System.out.print("��α� ��ǥ���� �Է��ϼ��� : ");
		DonationCenter.goal = sc.nextInt();
		
		while(true) {
			count++;
			System.out.print(count + "ȸ�� ��α��� �Է��ϼ��� : ");
			if(!donator.donate(sc.nextInt())) {
				count--;
				continue;
			}
			if (DonationCenter.donation > DonationCenter.goal)
				break;
			recipient.receipt();
			System.out.println("�Ŀ��� �Ѿ� : " + DonationCenter.donation + "����");
		}
		System.out.println("��ǥ���� �޼��Ǿ����ϴ�! �Ѿ� : " + DonationCenter.donation + "����");
		System.out.println("�� " + count + "ȸ ����ϼ̽��ϴ�.");
		sc.close();
	}
}
