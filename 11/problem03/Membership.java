package practice_11th_week.problem03;

import java.util.Scanner;

public class Membership {
	public static final int MAX_MEMBER = 10;
	protected Scanner sc;
	protected Member[] memberList;
	public Membership() {
		sc = new Scanner(System.in);
		memberList = new Member[MAX_MEMBER];
		memberList[0] = new Member(1001L);
		memberList[1] = new Member(1002L, "�ڴ�ȯ", 5300);
		memberList[2] = new Member(1003L, "Jake");
		memberList[3] = new Member(1004L, 7700);
	}
	// ȸ�� ���� ��ȸ
	protected void select() {
		if(memberList[0] == null) {
			System.out.println("(���� ����)");
		} else {
			System.out.println("id\tname\t\tmileage");
			System.out.println("==================================");
			for(Member m : memberList) {
				if(m == null)
					break;
				System.out.println(m.toString());
			}
			System.out.println("==================================");
		}
	}
	// ȸ�� ���� ����
	protected void update() {
		Member mEdit = null;
		System.out.print("������ ȸ�� id �Է� : ");
		long id = sc.nextLong();
		sc.nextLine();
		for (Member m : memberList) {
			if (m.getId() == id) {
				mEdit = m;
				break;
			}
		}
		System.out.print("�̸� : ");
		mEdit.set(sc.nextLine());
		System.out.print("���� ����Ʈ : ");
		mEdit.set(sc.nextInt());
		System.out.println("�����Ͽ����ϴ�.");
	}
	// ȸ�� ���� ��ȸ �� ���� ���
	public void manage() {
		System.out.println("**** ȸ�� ���� ���� ���α׷� ****");
		while(true) {
			System.out.print("1. ��ȸ, 2. ����, 3. ���� : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				select();
			} else if(mode == 2) {
				update();
			} else if(mode == 3) {
				break;
			} else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
	}
}
