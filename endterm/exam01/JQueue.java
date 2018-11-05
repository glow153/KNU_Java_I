package endterm.exam01;

public class JQueue {
	public static final int SIZE = 10;
	private int[] q = {0,0,0,0,0,0,0,0,0,0,0};
	
	public void offer(int data) {
		System.out.println("* 데이터 삽입 : " + data);
		for (int i = SIZE - 1; i > 0; i--) {
			q[i] = q[i-1];
		}
		q[0] = data;
	}

	public void print() {
		System.out.println("> 현재 큐 데이터 현황");
		for (int i = 0; i < SIZE; i++) {
			System.out.println("queue[" + i + "] : " + q[i]);
		}
	}
}
