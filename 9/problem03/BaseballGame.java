package practice_9th_week.problem03;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
	public static final int MAX_THROW = 10;
	private int[] answer;
	private int cntThrow;
	private Random r;
	private Scanner sc;

	public BaseballGame(int n) {
		answer = new int[n];
		r = new Random();
		sc = new Scanner(System.in);
		generateAnswer();
	}

	private void generateAnswer() {
		boolean rep = true;
		while (rep) {
			rep = false;
			for (int i = 0; i < answer.length; i++) { // generate
				answer[i] = r.nextInt(8) + 1;
			}

			if (answer.length == 1)
				break;

			for (int i = 0; i < answer.length - 1; i++) { // check repetition
				for (int j = i + 1; j < answer.length; j++) {
					if (answer[i] == answer[j]) {
						rep = true;
					}
				}
			}
		}
	}

	private int[] judge(int[] throwball) {
		int[] ret = { 0, 0 };
		for (int i = 0; i < throwball.length; i++) {
			for (int j = 0; j < throwball.length; j++) {
				if (throwball[i] == answer[j]) {
					if (i == j)
						ret[0] += 1;
					else
						ret[1] += 1;
				}
			}
		}
		return ret;
	}

	private int[] judge(int a) {
		if (answer[0] == a)
			return new int[] { 1, 0 };
		else
			return new int[] { 0, 0 };
	}

	private int[] judge(int a, int b) {
		return judge(new int[] { a, b });
	}

	private int[] judge(int a, int b, int c) {
		return judge(new int[] { a, b, c });
	}

	private int[] judge(int a, int b, int c, int d) {
		return judge(new int[] { a, b, c, d });
	}

	private int[] judge(int a, int b, int c, int d, int e) {
		return judge(new int[] { a, b, c, d, e });
	}

	public void play() {
		for (int i = 1; i <= MAX_THROW; i++) {
			int[] strikeBall = null;
			System.out.print("공을 던져주세요 : ");
			if (answer.length == 1) {
				strikeBall = judge(sc.nextInt());
			} else if (answer.length == 2) {
				strikeBall = judge(sc.nextInt(), sc.nextInt());
			} else if (answer.length == 3) {
				strikeBall = judge(sc.nextInt(), sc.nextInt(), sc.nextInt());
			} else if (answer.length == 4) {
				strikeBall = judge(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			} else if (answer.length == 5) {
				strikeBall = judge(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			}

			if (strikeBall[0] == answer.length) {
				System.out.println("정답!! 총 " + i + "번 던지셨습니다.");
				return;
			} else if (strikeBall[0] == 0 && strikeBall[1] == 0) {
				System.out.println("out 입니다.");
			} else {
				System.out.println(strikeBall[0] + " strike " + strikeBall[1] + " ball 입니다.");
			}
		}
		System.out.print("졌습니다. 정답은 ");
		for (int i = 0; i < answer.length; i++)
			System.out.print(answer[i] + " ");
		System.out.println("입니다.");
	}
}
