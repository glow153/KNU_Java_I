package practice_9th_week.problem03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BaseballGame game = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �߱� ����!");
		System.out.print("������ ũ�⸦ �����ּ��� (1~5) : ");
		game = new BaseballGame(sc.nextInt());
		sc.nextLine();
		game.play();
	}
}
