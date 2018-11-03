package practice_10th_week.problem03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
	private Random rand;
	private Scanner sc;

	private int[] lot;
	private int secondBonusBall;
	private int[] entry;

	public Lottery() {
		rand = new Random();
		sc = new Scanner(System.in);
		lot = new int[6];
		entry = new int[6];
	}

	private void generate(int[] ia) {
		while (true) {
			boolean retry = false;
			for (int i = 0; i < ia.length; i++) //generate
				ia[i] = rand.nextInt(45) + 1;

			for (int i = 0; i < ia.length - 1; i++) { //check coupled
				for (int j = i + 1; j < ia.length; j++) {
					if(ia[i] == ia[j])
						retry = true;
				}
				if(retry)
					break;
			}
			if(!retry)
				break;
		}
	}
	
	private void generate2ndBonus() {
		while(true) {
			boolean coupled = false;
			secondBonusBall = rand.nextInt(45) + 1;
			for (int i = 0; i < lot.length; i++) {
				if(lot[i] == secondBonusBall) {
					coupled = true;
					break;
				}
			}
			if(!coupled)
				break;
		}
	}
	
	private void printResult(int grade) {
		System.out.print("��÷ ��ȣ : ");
		for(int i=0;i<lot.length;i++) {
			System.out.print(lot[i] + " ");
		}
		System.out.println(", 2�� ���ʽ��� : " + secondBonusBall);
		
		System.out.print("���� ��ȣ : ");
		for(int i=0;i<entry.length;i++) {
			System.out.print(entry[i] + " ");
		}
		System.out.println();
		
		if(grade == 6) {
			System.out.println("���Դϴ�.");
		} else {
			System.out.println("�����մϴ�! "+ grade +"���Դϴ�!");
		}
	}

	public void playLottery() {
		String input;
		String[] inputSplit;
		
		System.out.println("***** �ζ� ��÷�� *****");
		while(true) {
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
			input = sc.nextLine();
			inputSplit = input.split(" ");
			if(inputSplit.length == 6) {
				break;
			} else {
				System.out.println("�����ȣ�� 6���� �Է� �����մϴ�.");
			}
		}
		
		generate(lot);
		generate2ndBonus();
		for(int i = 0; i < entry.length; i++) {
			entry[i] = Integer.parseInt(inputSplit[i]);
		}
		
		Arrays.sort(lot);
		Arrays.sort(entry);
		
		int grade = LottoJudge.grade(lot, secondBonusBall, entry);
		printResult(grade);
	}
	
	public boolean playLottery(boolean auto) {
		String input;
		String[] inputSplit;
		
		System.out.println("***** �ζ� ��÷�� *****");
		while(true) {
			System.out.print("���� ��ȣ�� �Է��ϼ��� : ");
			if(auto) {
				generate(entry);
				break;
			} else {
				input = sc.nextLine();
				inputSplit = input.split(" ");
				if(inputSplit.length == 6) {
					break;
				} else {
					System.out.println("�����ȣ�� 6���� �Է� �����մϴ�.");
				}
				for(int i = 0; i < entry.length; i++) {
					entry[i] = Integer.parseInt(inputSplit[i]);
				}
			}
		}
		
		generate(lot);
		generate2ndBonus();
		
		Arrays.sort(lot);
		Arrays.sort(entry);
		
		int grade = LottoJudge.grade(lot, secondBonusBall, entry);
		printResult(grade);
		
		if(grade == 6)
			return true;
		else
			return false;
	}
}
