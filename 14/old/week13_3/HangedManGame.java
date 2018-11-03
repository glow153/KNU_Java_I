package week13_3;

import java.util.Scanner;

public class HangedManGame extends Words implements IPuzzleGame {

	Scanner sc = new Scanner(System.in);
	
	int iCount;
	String strAnswer;
	String[] strAnswers;
	String[] strShows;
	boolean[] isAnswers;
	
	@Override
	public void info() {
		System.out.println("=== Hanged Man Game ===");
	}

	@Override
	public void setAnswer() {
		strAnswer = getWord();
		strAnswers = strAnswer.split("");
		strShows = new String[strAnswer.length()];
		isAnswers = new boolean[strAnswer.length()];
		
		for (int i = 0; i < strShows.length; i++) {
			strShows[i] = "_";
		}
		
		if (strAnswer.length() < 10)
			iCount = 10;
		else
			iCount = 15;
		
		System.out.println("문제 생성 완료");
	}
	
	public void setShows(int mIndex) {
		strShows[mIndex] = strAnswers[mIndex];
	}

	@Override
	public void start() {		
		info();
		setAnswer();
		System.out.println("기회는 " + iCount + "번 입니다.");
		
		process();		
	}

	@Override
	public void process() {
		for (; iCount > 0; iCount--) {
			for (int j = 0; j < strShows.length; j++) {
				System.out.print(strShows[j] + " ");
			}
			System.out.println("(남은 기회 : " + iCount + "번)");
			check();			
		}
			end();
		
	}

	@Override
	public void check() {
		String str = sc.next();
		
		for (int i = 0; i < strAnswers.length; i++) {
			if (strAnswers[i].equals(str)) {
				setShows(i);
				isAnswers[i] = true;
			}
		}
		
		boolean isTemp = true;
		for (int i = 0; i < strAnswers.length; i++) {
			isTemp = isTemp && isAnswers[i];
		}
		if (isTemp)
			iCount = 0;
	}

	@Override
	public void end() {
		for (int i = 0; i < strAnswer.length(); i++) {
			System.out.print(strAnswers[i] + " ");
		}
		
		if (iCount == -1) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("정답을 맞추지 못하셨습니다.");
			System.out.println("정담 : " + strAnswer);
		}
	}

}
