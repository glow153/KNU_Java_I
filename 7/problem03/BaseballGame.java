package practice_7th_week.problem03;

import java.util.Random;

public class BaseballGame {
	private Random r = new Random();
	private int[] answer = new int[3];
	private int cntThrow;
	
	public void initialize() {
		cntThrow = 0;
		while(true) {
			for(int i=0;i<3;i++){
				answer[i] = r.nextInt(9) + 1;
			}
			if(answer[0] != answer[1] &&
					answer[0] != answer[2] &&
					answer[1] != answer[2]) {
				break;
			}
		}
	}
	
	public int[] judge(int[] input) {
		cntThrow += 1;
		
		int strike = 0, ball = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(answer[i] == input[j]){
					if(i==j)
						strike++;
					else
						ball++;
				}
			}
		}
		
		return new int[] {strike, ball};
	}
	
	public int getCntThrow() {
		return cntThrow;
	}
}
