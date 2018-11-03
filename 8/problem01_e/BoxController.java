package practice_8th_week.problem01_e;

import java.util.Scanner;

public class BoxController {
	private Scanner sc = new Scanner(System.in);
	private BoxModel box1, box2;
	
	public void setModel(BoxModel inst1, BoxModel inst2) {
		box1 = inst1;
		box2 = inst2;
	}
	
	public void inputBox () {
		System.out.print("첫번째 박스의 가로, 세로, 높이 입력: ");
		box1.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.print("두번째 박스의 가로, 세로, 높이 입력: ");
		box2.setSize(sc.nextInt(), sc.nextInt(), sc.nextInt());
	}
	
	public void showVolume() {
		System.out.println(box1.getName()+"의 부피 : "+box1.getVolume());
		System.out.println(box2.getName()+"의 부피 : "+box2.getVolume());
	}
	
	public void putInTest() {
		if (box1.canPutIn(box2)) {
			System.out.println(box2.getName()+"안에 "+box1.getName()+"를 넣을 수 있습니다.");
		} else if (box2.canPutIn(box1)) {
			System.out.println(box1.getName()+"안에 "+box2.getName()+"를 넣을 수 있습니다.");
		} else {
			System.out.println("서로 넣을 수 없습니다.");
		}
	}
}
