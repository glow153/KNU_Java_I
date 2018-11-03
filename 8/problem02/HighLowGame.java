package practice_8th_week.problem02;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
	private int answer;
	private Random r = null;
	private Scanner sc = null;
	
	public void initialize() {
		System.out.println("High Low Game!");
		System.out.println("initializing...");
		sc = new Scanner(System.in);
		r = new Random();
		answer = r.nextInt(100) + 1;
		System.out.println("complete!");
	}
	
	private int guess(int num) {
		if(answer > num)
			return 1;
		else if (answer < num)
			return -1;
		else
			return 0;
	}
	
	public void play() {
		int input = 0;
		for(int i=0;i<7;i++) {
			System.out.print("���ڸ� ���纸���� : ");
			input = sc.nextInt();
			switch(guess(input)) {
			case -1:
				System.out.println("������ " + input + " ���� �۽��ϴ�.");
				break;
			case 0:
				System.out.println(input + " : �����Դϴ�!!");
				System.out.println("�õ� Ƚ�� : " + (i+1));
				return;
			case 1:
				System.out.println("������ " + input + " ���� Ů�ϴ�.");
				break;
			}
		}
		System.out.println("����� �����ϴ�. ������ " + answer);
	}
}
