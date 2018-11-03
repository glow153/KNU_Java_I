package practice_13th_week.problem02;

import java.util.Scanner;

public class ReservationSeat {
	private Scanner sc = null;
	private boolean isRun = true;
	private Theater theater;
	
	public ReservationSeat() {
		sc = new Scanner(System.in);
		System.out.println("=== 좌석 예약 프로그램 ===");
	}
	
	public void menu() {
		System.out.println("1. 영화관 선택");
		System.out.println("2. 좌석 예약");
		System.out.println("3. 좌석 확인");
		System.out.println("4. 종료");
		System.out.print("메뉴를 선택해 주세요 : ");
		
		switch (sc.nextInt()) {
			case 1:
				choiceTheater();
				break;
			case 2:
				if (theater != null)
					reserve();
				else
					System.out.println("영화관을 먼저 선택해주세요.");
				break;
			case 3:
				theater.checkSeat();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}
	
	private void choiceTheater() {
		System.out.println("1. 야우리시네마  2.메가박스  3.CGV");
		System.out.print("영화관을 선택해주세요 : ");
		
		switch(sc.nextInt()) {
			case 1 :
				theater = new Megabox();
				break;
			case 2 :
				theater = new CGV();
				break;
			case 3 :
				theater = new Yawoori();
				break;	
			default :
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}
	
	private void reserve() {
		theater.printWelcome();
		sc.nextLine();
		System.out.print("좌석을 선택해 주세요.(A-C,1-5) : ");
		String[] strArr = sc.nextLine().split(",");
		theater.reserveSeat(strArr[0].charAt(0), Integer.parseInt(strArr[1])-1);
	}
	
	public boolean isRunning() {
		return isRun;
	}
}
