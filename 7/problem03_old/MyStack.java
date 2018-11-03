package practice_7th_week.problem03;

public class MyStack {
	private int[] iaData = new int[10];
	private int stkptr = -1;
	// public boolean push(int n) {
	public void push(int n) { 
		if(stkptr >= iaData.length - 1) {
			System.out.println("스택이 가득 찼습니다.");
		} else {
			iaData[++stkptr] = n;
			System.out.println("pushed : " + n);
		}
	}
	public void pop() {
		if (stkptr < 0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			System.out.println("popped : " + iaData[stkptr--]);
		}
	}
}
