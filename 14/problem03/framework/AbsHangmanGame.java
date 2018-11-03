package practice_14th_week.problem03.framework;

import java.util.Scanner;

public abstract class AbsHangmanGame {
	protected Scanner sc;
	protected String answer; //���þ�
	protected boolean[] isBlank; //�� ĭ
	protected int count, max; //�õ� Ƚ��, �ִ� Ƚ��
	protected char input; //����� �Է� ���� ����
	
	protected abstract void intro(); //�õ� ���� �ִ� Ƚ�� ���
	protected abstract void print(); //���þ� �� �� ĭ�� ���� ���� ���
	protected abstract void guess(); //����� ���� ���� �Է�
	protected abstract void check(); //���ҹ��� 1���� üũ, ���þ�� ��
	protected abstract boolean gameEnd(); //���� �����̸� true, ��� �����̸� false
	
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

