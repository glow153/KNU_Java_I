package practice_11th_week.problem02.oper;

import practice_11th_week.problem02.Operator;

public class Subtraction extends Operator {
	public Subtraction(int num1, int num2) {
		super(num1, num2);
	}

	@Override
	public int operation() {
		return num1 - num2;
	}
	
}
