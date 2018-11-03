package practice_7th_week.problem03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyStack stack = new MyStack();
		while(true) {
			System.out.print("MyStack> ");
			String cmd = sc.next();
			if(cmd.equals("push")) {
				int val = sc.nextInt();
				stack.push(val);
			} else if (cmd.equals("pop")) {
				stack.pop();
			} else if (cmd.equals("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령어입니다.");
			}
		}
		System.out.println("안녕~");
		sc.close();
	}
}
