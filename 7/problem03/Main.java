package practice_7th_week.problem03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseballGame game = new BaseballGame();
		
		System.out.println("숫자 야구 게임!");
		game.initialize();
		
		while(true) {
			int[] input = new int[3];
			System.out.print("공을 던져주세요 : ");
			for(int i=0;i<3;i++)
				input[i] = sc.nextInt();
			
			//process
			int[] sb = game.judge(input);
			if(sb[0] == 3) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println(sb[0] + " strike " + sb[1] + " ball입니다.");
			}
		}
		System.out.println("투구 횟수 : " + game.getCntThrow());
		sc.close();
	}
}
