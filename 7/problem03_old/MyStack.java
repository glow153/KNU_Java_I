package practice_7th_week.problem03;

public class MyStack {
	private int[] iaData = new int[10];
	private int stkptr = -1;
	// public boolean push(int n) {
	public void push(int n) { 
		if(stkptr >= iaData.length - 1) {
			System.out.println("������ ���� á���ϴ�.");
		} else {
			iaData[++stkptr] = n;
			System.out.println("pushed : " + n);
		}
	}
	public void pop() {
		if (stkptr < 0) {
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			System.out.println("popped : " + iaData[stkptr--]);
		}
	}
}
