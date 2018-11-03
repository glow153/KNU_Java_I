package practice_14th_week.problem02;

import java.util.Scanner;

public class StringFinder {
	private StringBuffer post;
	private Scanner sc;
	private boolean isRun;

	public StringFinder() {
		sc = new Scanner(System.in);
		isRun = true;
		post = new StringBuffer("Be thankful for what you have; "
								+ "you'll end up having more. "
								+ "If you concentrate on what you don't have, "
								+ "you will never, ever have enough.");
	}

	public void menu() {
		System.out.println("1. 본문 출력, 2. 단어 검색, 3. 종료");
		System.out.print("메뉴 입력 : ");
		int m = sc.nextInt();
		sc.nextLine();

		if (m == 1) {
			System.out.println(post);
			System.out.println("총 길이 : " + post.length());
			System.out.println();
		} else if (m == 2) {
			find();
		} else if (m == 3) {
			System.out.println("종료합니다.");
			isRun = false;
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void find() {
		StringBuffer sb = new StringBuffer();
		int i = 0;

		System.out.print("찾을 문자를 입력하세요 : ");
		String word = sc.nextLine();
		
//		for (i = 0; i < post.length(); i++) {
//			if (post.substring(i).startsWith(word)) {
		for (i = 0; i < post.length() - word.length() + 1; i++) {
			if (post.substring(i, i + word.length()).equals(word)) {
				if (sb.length() > 0)
					sb.append(", " + (i + 1));
				else
					sb.append(i + 1);
			}
		}
		if (sb.length() > 0)
			System.out.println(word + "는 " + sb.toString() + "번 째 위치에 있습니다.");
		else
			System.out.println(word + "가 본문에 없습니다.");
	}

	public boolean isRunning() {
		return isRun;
	}
}
