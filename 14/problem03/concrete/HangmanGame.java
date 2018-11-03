package practice_14th_week.problem03.concrete;

import java.util.Scanner;

import practice_14th_week.problem03.framework.AbsHangmanGame;

public class HangmanGame extends AbsHangmanGame {
	
	public HangmanGame() {
		sc = new Scanner(System.in);
		answer = "committee";
		count = 1;
		max = 8;
		
		isBlank = new boolean[answer.length()];
		for (int i = 0; i < isBlank.length; i++)
			isBlank[i] = true;
	}

	@Override
	protected void intro() {
		// TODO Auto-generated method stub
		System.out.println("Hangman Game!");
		System.out.println("�� �õ�Ƚ�� : " + max + "ȸ");
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < answer.length(); i++) {
			if (isBlank[i])
				System.out.print("_ ");
			else
				System.out.print(answer.charAt(i) + " ");
		}
		System.out.println();
	}

	@Override
	protected void guess() {
		// TODO Auto-generated method stub
		String str = "";
		while (true) {
			System.out.print(max + "ȸ �� " + count + "ȸ�� �õ� : ");
			str = sc.nextLine();
			
			if (str.length() > 1) {
				System.out.println("�� ���ڸ� ������ �� �ֽ��ϴ�.");
			} else if (!Character.isAlphabetic(str.charAt(0))) {
//			} else if (str.matches("[^a-z]")) {
				System.out.println("�����ڸ� �����մϴ�.");
			} else {
				break;
			}
		}
		
		input = Character.toLowerCase(str.charAt(0));
	}
	
	@Override
	protected void check() {
		// TODO Auto-generated method stub
		boolean matched = false;
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == input) {
				isBlank[i] = false;
				matched = true;
			}
		}
		
		if(matched)
			System.out.println("������ϴ�!");
		else
			System.out.println("Ʋ�Ƚ��ϴ�!");
	}

	@Override
	protected boolean gameEnd() {
		// TODO Auto-generated method stub
		int answerCount = 0;
		for(int i=0;i<isBlank.length;i++) {
			if(!isBlank[i])
				answerCount += 1;
		}
		
		if(answerCount == answer.length()) {
			System.out.println("����!");
			return true;
		} else if (count >= max) {
			System.out.println("����! ������ " + answer + "�Դϴ�.");
			return true;
		} else {
			count += 1;
			return false;
		}
	}
}
