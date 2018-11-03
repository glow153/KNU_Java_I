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
		memberList[1] = new Member(1002L, "박대환", 5300);
		memberList[2] = new Member(1003L, "Jake");
		memberList[3] = new Member(1004L, 7700);
	}
	// 회원 정보 조회
	protected void select() {
		if(memberList[0] == null) {
			System.out.println("(정보 없음)");
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
	// 회원 정보 수정
	protected void update() {
		Member mEdit = null;
		System.out.print("수정할 회원 id 입력 : ");
		long id = sc.nextLong();
		sc.nextLine();
		for (Member m : memberList) {
			if (m.getId() == id) {
				mEdit = m;
				break;
			}
		}
		System.out.print("이름 : ");
		mEdit.set(sc.nextLine());
		System.out.print("적립 포인트 : ");
		mEdit.set(sc.nextInt());
		System.out.println("수정하였습니다.");
	}
	// 회원 정보 조회 및 수정 기능
	public void manage() {
		System.out.println("**** 회원 정보 수정 프로그램 ****");
		while(true) {
			System.out.print("1. 조회, 2. 수정, 3. 종료 : ");
			int mode = sc.nextInt();
			sc.nextLine();
			
			if(mode == 1) {
				select();
			} else if(mode == 2) {
				update();
			} else if(mode == 3) {
				break;
			} else {
				System.out.println("잘못 누르셨습니다.");
			}
		}
	}
}
