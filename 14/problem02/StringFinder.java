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
		System.out.println("1. ���� ���, 2. �ܾ� �˻�, 3. ����");
		System.out.print("�޴� �Է� : ");
		int m = sc.nextInt();
		sc.nextLine();

		if (m == 1) {
			System.out.println(post);
			System.out.println("�� ���� : " + post.length());
			System.out.println();
		} else if (m == 2) {
			find();
		} else if (m == 3) {
			System.out.println("�����մϴ�.");
			isRun = false;
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void find() {
		StringBuffer sb = new StringBuffer();
		int i = 0;

		System.out.print("ã�� ���ڸ� �Է��ϼ��� : ");
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
			System.out.println(word + "�� " + sb.toString() + "�� ° ��ġ�� �ֽ��ϴ�.");
		else
			System.out.println(word + "�� ������ �����ϴ�.");
	}

	public boolean isRunning() {
		return isRun;
	}
}
