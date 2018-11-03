package practice_9th_week.problem02;

import java.util.Scanner;

public class BaseConversion {
	Scanner sc = null;
	public BaseConversion() {
		sc = new Scanner(System.in);
	}
	
	public void process() {
		System.out.println("진법 변환기");
		System.out.println("1. 10진법 -> 2진법");
		System.out.println("2. 2진법 -> 10진법");
		System.out.print("입력 (1 또는 2) : ");
		int mode = sc.nextInt();
		if(mode == 1) {
			System.out.print("변환할 수 입력 : ");
			int input = sc.nextInt();
			System.out.println("10진수 " + input + "은 2진수로 "
					+ BaseConverter.convert(input) + "입니다.");
		} else if(mode == 2) {
			System.out.print("변환할 수 입력 : ");
			String input = sc.next();
			System.out.println("2진수 " + input + "은 10진수로 "
					+ BaseConverter.convert(input) + "입니다.");
		}
	}
}
