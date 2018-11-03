package practice_7th_week.problem01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MyCalc calc = new MyCalc();
		while(true) {
			int a = sc.nextInt();
			if(a == -1)
				break;
			char c = sc.next().charAt(0);
			int b = sc.nextInt();
			
			switch(c) {
			case '+':
				System.out.println(calc.addition(a, b));
				break;
			case '-':
				System.out.println(calc.subtraction(a, b));
				break;
			case '*':
				System.out.println(calc.multiplication(a, b));
				break;
			case '/':
				if (b == 0)
					System.out.println("div0 error");
				else
					System.out.println(calc.division(a, b));
				break;
			default:
				System.out.println("op error");
				break;
			}
		}
	}
}
