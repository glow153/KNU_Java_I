package practice_7th_week.problem02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SemesterGrade sg = new SemesterGrade();
		
		for(int i=0;i<7;i++) {
			System.out.print((i+1) + "번째 과목 정보 입력(과목명 학점 성적) : ");
			sg.insert(sc.next(), sc.nextInt(), sc.nextDouble());
		}
		System.out.println("--------------------------------------");
		System.out.println("이번학기 평점평균 : " + sg.getAverageGrade());
	}
}
