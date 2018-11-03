package practice_9th_week.problem03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BaseballGame game = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 야구 게임!");
		System.out.print("정답의 크기를 정해주세요 (1~5) : ");
		game = new BaseballGame(sc.nextInt());
		sc.nextLine();
		game.play();
	}
}
