package practice_13th_week.problem02;

public abstract class Theater {
	boolean[][] seat = new boolean[3][5];
	
	public abstract void printWelcome();
	
	public void reserveSeat(char row, int col) {
		if (seat[row-65][col]) { 
			System.out.println("이미 예약된 자리입니다.");
		} else {
			seat[row-65][col]= true;
			System.out.println(row + "열 " + col + "번으로 예약 되었습니다.");
		}
	}
	
	public void checkSeat() {
		System.out.println("  1 2 3 4 5");
		for (int i = 0; i < seat.length; i++) {
			System.out.print((char)(i+65) + " ");
			for (int j = 0; j < seat[i].length; j++) {
				if (seat[i][j])
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
	
}
