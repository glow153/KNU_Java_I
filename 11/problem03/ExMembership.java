package practice_11th_week.problem03;

import java.util.Scanner;

public class ExMembership extends Membership {
	private int count;
	
	public ExMembership() {
		sc = new Scanner(System.in);
		memberList = new Member[MAX_MEMBER];
		count = 0;
	}
	
	private final void insert() {
		if(count >= MAX_MEMBER) {
			System.out.println("ȸ�� ���� �ִ��Դϴ�.");
		} else {
			System.out.print("\"id �̸� ����Ʈ\" �� �Է��ϼ��� (id�� �ʼ�) : ");
			String[] line = sc.nextLine().split(" ");
			
			if(line.length == 3) {
				long id = Long.parseLong(line[0]);
				String name = line[1];
				int mileage = Integer.parseInt(line[2]);
				
				memberList[count] = new Member(id, name, mileage);
			} else if(line.length == 2) {
				long id = Long.parseLong(line[0]);
				String name;
				int mileage;
				try {
					mileage = Integer.parseInt(line[1]);
					memberList[count] = new Member(id, mileage);
				} catch (NumberFormatException e) {
					name = line[1];
					memberList[count] = new Member(id, name);
				}
			} else if(line.length == 1) {
				long id = Long.parseLong(line[0]);
				memberList[count] = new Member(id);
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				return;
			}
			count += 1;
			System.out.println("�߰��Ǿ����ϴ�.");
		}
	}

	@Override
	public void manage() {
		System.out.println("*** ȸ�� ���� ���� ���α׷� ***");
		while(true) {
			System.out.print("1. ��ȸ, 2. ����, 3. �߰�, 4. ���� : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				select();
			} else if(mode == 2) {
				update();
			} else if(mode == 3) {
				insert();
			} else if(mode == 4) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}
	}
}
