package practice_7th_week.problem02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SemesterGrade sg = new SemesterGrade();
		
		for(int i=0;i<7;i++) {
			System.out.print((i+1) + "��° ���� ���� �Է�(����� ���� ����) : ");
			sg.insert(sc.next(), sc.nextInt(), sc.nextDouble());
		}
		System.out.println("--------------------------------------");
		System.out.println("�̹��б� ������� : " + sg.getAverageGrade());
	}
}
