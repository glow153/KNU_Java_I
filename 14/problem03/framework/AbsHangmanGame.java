package practice_14th_week.problem03.framework;

import java.util.Scanner;

public abstract class AbsHangmanGame {
	protected Scanner sc;
	protected String answer; //제시어
	protected boolean[] isBlank; //빈 칸
	protected int count, max; //시도 횟수, 최대 횟수
	protected char input; //사용자 입력 문자 변수
	
	protected abstract void intro(); //시도 가능 최대 횟수 출력
	protected abstract void print(); //제시어 중 빈 칸과 맞춘 글자 출력
	protected abstract void guess(); //사용자 추측 글자 입력
	protected abstract void check(); //영소문자 1글자 체크, 제시어와 비교
	protected abstract boolean gameEnd(); //게임 종료이면 true, 계속 진행이면 false
	
	public void play() {
		intro();
		print();
		while (true) {
			guess();
			check();
			print();
			if(gameEnd())
				break;
		}
	}
}

