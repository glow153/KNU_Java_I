package practice_11th_week.problem02.oper;

import practice_11th_week.problem02.Operator;

public class Remainder extends Operator {
	public Remainder(int num1, int num2) {
		super(num1, num2);
	}

	public int operation() {
		return num1 % num2;
	}
}
