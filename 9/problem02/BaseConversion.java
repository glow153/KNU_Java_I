package practice_9th_week.problem02;

import java.util.Scanner;

public class BaseConversion {
	Scanner sc = null;
	public BaseConversion() {
		sc = new Scanner(System.in);
	}
	
	public void process() {
		System.out.println("���� ��ȯ��");
		System.out.println("1. 10���� -> 2����");
		System.out.println("2. 2���� -> 10����");
		System.out.print("�Է� (1 �Ǵ� 2) : ");
		int mode = sc.nextInt();
		if(mode == 1) {
			System.out.print("��ȯ�� �� �Է� : ");
			int input = sc.nextInt();
			System.out.println("10���� " + input + "�� 2������ "
					+ BaseConverter.convert(input) + "�Դϴ�.");
		} else if(mode == 2) {
			System.out.print("��ȯ�� �� �Է� : ");
			String input = sc.next();
			System.out.println("2���� " + input + "�� 10������ "
					+ BaseConverter.convert(input) + "�Դϴ�.");
		}
	}
}
