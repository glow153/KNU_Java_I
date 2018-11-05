package endterm.exam01;

public class Main {
	public static void main(String[] args) {
		JQueue queue = new JQueue();
		for (int i = 0; i < JQueue.SIZE; i++) {
			queue.offer(i + 1);
		}
		queue.print();
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.print();
	}
}
