package practice_7th_week.problem03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BaseballGame game = new BaseballGame();
		
		System.out.println("���� �߱� ����!");
		game.initialize();
		
		while(true) {
			int[] input = new int[3];
			System.out.print("���� �����ּ��� : ");
			for(int i=0;i<3;i++)
				input[i] = sc.nextInt();
			
			//process
			int[] sb = game.judge(input);
			if(sb[0] == 3) {
				System.out.println("�����Դϴ�!");
				break;
			} else {
				System.out.println(sb[0] + " strike " + sb[1] + " ball�Դϴ�.");
			}
		}
		System.out.println("���� Ƚ�� : " + game.getCntThrow());
		sc.close();
	}
}
