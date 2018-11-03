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
			System.out.println("회원 수가 최대입니다.");
		} else {
			System.out.print("\"id 이름 포인트\" 를 입력하세요 (id값 필수) : ");
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
				System.out.println("잘못 입력하셨습니다.");
				return;
			}
			count += 1;
			System.out.println("추가되었습니다.");
		}
	}

	@Override
	public void manage() {
		System.out.println("*** 회원 정보 관리 프로그램 ***");
		while(true) {
			System.out.print("1. 조회, 2. 수정, 3. 추가, 4. 종료 : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				select();
			} else if(mode == 2) {
				update();
			} else if(mode == 3) {
				insert();
			} else if(mode == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
	}
}
