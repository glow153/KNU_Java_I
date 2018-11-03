package practice_12th_week.problem01;

import java.util.Scanner;

public class CourseRecommend {
	private Scanner sc;
	private KoreanCourse korean;
	private ChineseCourse chinese;
	private JapaneseCourse japanese;
	
	public CourseRecommend() {
		sc = new Scanner(System.in);
		korean = new KoreanCourse();
		chinese = new ChineseCourse();
		japanese = new JapaneseCourse();
	}
	
	public void recommend() {
		while(true) {
			System.out.println("1. �ѽ�, 2. �߽�, 3. �Ͻ�, 4. ����");
			System.out.print("�Է� : ");
			switch(sc.nextInt()) {
			case 1:
				korean.startDinner();
				break;
			case 2:
				chinese.startDinner();
				break;
			case 3:
				japanese.startDinner();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}
