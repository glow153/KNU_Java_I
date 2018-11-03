package practice_11th_week.problem02;

import java.util.Scanner;

import practice_11th_week.problem02.oper.Addition;
import practice_11th_week.problem02.oper.Multiplication;
import practice_11th_week.problem02.oper.Quotient;
import practice_11th_week.problem02.oper.Remainder;
import practice_11th_week.problem02.oper.Subtraction;

public class Calculator {
	private Scanner sc;
	public Calculator() {
		System.out.println("상속 계산기");
		sc = new Scanner(System.in);
	}
	
	public void calc() {
		while(true) {
			int result = 0;
			System.out.print("수식 입력 : ");
			String line = sc.nextLine();
			String[] formula = line.split(" ");
			
			if (formula.length < 3) {
				if(line.equals("exit")) {
					System.out.println("종료합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			} else {
				if (formula[1].equals("+")) {
					 result = new Addition(Integer.parseInt(formula[0]),
											Integer.parseInt(formula[2])).operation();
				} else if (formula[1].equals("-")) {
					 result = new Subtraction(Integer.parseInt(formula[0]),
											Integer.parseInt(formula[2])).operation();
				} else if (formula[1].equals("*")) {
					 result = new Multiplication(Integer.parseInt(formula[0]),
												Integer.parseInt(formula[2])).operation();
				} else if (formula[1].equals("/")) {
					 result = new Quotient(Integer.parseInt(formula[0]),
											Integer.parseInt(formula[2])).operation();
				} else if (formula[1].equals("%")) {
					 result = new Remainder(Integer.parseInt(formula[0]),
											Integer.parseInt(formula[2])).operation();
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			}
			
			System.out.println(line + " = " + result);
		}
	}
}
