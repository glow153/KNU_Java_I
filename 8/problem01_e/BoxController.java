package practice_8th_week.problem01_e;

import java.util.Scanner;

public class BoxController {
	private Scanner sc = new Scanner(System.in);
	private BoxModel box1, box2;
	
	public void setModel(BoxModel inst1, BoxModel inst2) {
		box1 = inst1;
		box2 = inst2;
	}
	
	public void inputBox () {
		System.out.print("ù��° �ڽ��� ����, ����, ���� �Է�: ");
		box1.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("�ι�° �ڽ��� ����, ����, ���� �Է�: ");
		box2.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
	
	public void showVolume() {
		System.out.println(box1.getName()+"�� ���� : "+box1.getVolume());
		System.out.println(box2.getName()+"�� ���� : "+box2.getVolume());
	}
	
	public void putInTest() {
		if (box1.canPutIn(box2)) {
			System.out.println(box2.getName()+"�ȿ� "+box1.getName()+"�� ���� �� �ֽ��ϴ�.");
		} else if (box2.canPutIn(box1)) {
			System.out.println(box1.getName()+"�ȿ� "+box2.getName()+"�� ���� �� �ֽ��ϴ�.");
		} else {
			System.out.println("���� ���� �� �����ϴ�.");
		}
	}
}
