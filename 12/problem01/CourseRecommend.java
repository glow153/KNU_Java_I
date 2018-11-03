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
			System.out.println("1. 한식, 2. 중식, 3. 일식, 4. 종료");
			System.out.print("입력 : ");
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
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
}
