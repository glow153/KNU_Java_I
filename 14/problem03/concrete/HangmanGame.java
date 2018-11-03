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
		System.out.println("총 시도횟수 : " + max + "회");
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
			System.out.print(max + "회 중 " + count + "회차 시도 : ");
			str = sc.nextLine();
			
			if (str.length() > 1) {
				System.out.println("한 글자만 추측할 수 있습니다.");
			} else if (!Character.isAlphabetic(str.charAt(0))) {
//			} else if (str.matches("[^a-z]")) {
				System.out.println("영문자만 가능합니다.");
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
			System.out.println("맞췄습니다!");
		else
			System.out.println("틀렸습니다!");
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
			System.out.println("성공!");
			return true;
		} else if (count >= max) {
			System.out.println("실패! 정답은 " + answer + "입니다.");
			return true;
		} else {
			count += 1;
			return false;
		}
	}
}
