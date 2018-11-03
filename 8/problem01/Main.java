package practice_8th_week.problem01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Box box1 = new Box();
		Box box2 = new Box();
		
		//input box
		System.out.print("ù��° �ڽ��� ����, ����, ���� �Է�: ");
		box1.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("�ι�° �ڽ��� ����, ����, ���� �Է�: ");
		box2.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		//show volume
		System.out.println(box1.getName()+"�� ���� : "+box1.getVolume());
		System.out.println(box2.getName()+"�� ���� : "+box2.getVolume());
		
		//put in test
		if (box1.canPutIn(box2)) {
			System.out.println(box2.getName()+"�ȿ� "+box1.getName()+"�� ���� �� �ֽ��ϴ�.");
		} else if (box2.canPutIn(box1)) {
			System.out.println(box1.getName()+"�ȿ� "+box2.getName()+"�� ���� �� �ֽ��ϴ�.");
		} else {
			System.out.println("���� ���� �� �����ϴ�.");
		}
		
		sc.close();
	}
}
