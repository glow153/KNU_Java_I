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
		System.out.println("��� ����");
		sc = new Scanner(System.in);
	}
	
	public void calc() {
		while(true) {
			int result = 0;
			System.out.print("���� �Է� : ");
			String line = sc.nextLine();
			String[] formula = line.split(" ");
			
			if (formula.length < 3) {
				if(line.equals("exit")) {
					System.out.println("�����մϴ�.");
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
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
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
			}
			
			System.out.println(line + " = " + result);
		}
	}
}
