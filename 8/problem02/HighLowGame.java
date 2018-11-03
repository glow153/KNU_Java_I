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
			System.out.print("숫자를 맞춰보세요 : ");
			input = sc.nextInt();
			switch(guess(input)) {
			case -1:
				System.out.println("정답은 " + input + " 보다 작습니다.");
				break;
			case 0:
				System.out.println(input + " : 정답입니다!!");
				System.out.println("시도 횟수 : " + (i+1));
				return;
			case 1:
				System.out.println("정답은 " + input + " 보다 큽니다.");
				break;
			}
		}
		System.out.println("당신은 졌습니다. 정답은 " + answer);
	}
}
