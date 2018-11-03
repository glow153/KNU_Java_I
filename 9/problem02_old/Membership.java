package practice_9th_week.problem02_old;

import java.util.Scanner;

public class Membership {
	public static final int MAX_MEMBER = 10;
	private Scanner sc;
	private Member[] memberList;
	private int lastIdx;
	
	public Membership() {
		sc = new Scanner(System.in);
		memberList = new Member[MAX_MEMBER];
		lastIdx = 0;
	}

	private void insert(Member member) {
		if(lastIdx >= MAX_MEMBER) {
			System.out.println("회원수가 가득 찼습니다.");
			return;
		}
		memberList[lastIdx] = member;
		lastIdx += 1;
	}
	
	private void select() {
		System.out.println("id\t\t\t이름\t\t적립 포인트");
		for(Member m : memberList) {
			if(m == null)
				break;
			System.out.println(m.toString());
		}
	}
	
	public void manage() {
		while(true) {
			System.out.print("/> ");
			String input = sc.nextLine();
			if (input.equals("exit"))
				break;
			String[] saInput = input.split(" ");
			
			if (saInput[0].equals("select")) {
				select();
			} else if (saInput[0].equals("insert")) {
				if (saInput.length == 4)
					insert(new Member(
							Long.parseLong(saInput[1]),
							saInput[2],
							Integer.parseInt(saInput[3])));
				else if (saInput.length == 3)
					insert(new Member(
							Long.parseLong(saInput[1]),
							saInput[2]));
				else
					insert(new Member(Long.parseLong(saInput[1])));
			}
		}
	}
}
