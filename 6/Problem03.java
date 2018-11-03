import java.util.Scanner;
import java.util.Random;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] answer = new int[3];
		for(int i=0;i<3;i++){
			answer[i] = r.nextInt(9) + 1;
		}
		if(answer[0] == answer[1])
			while(answer[0] == answer[1])
				answer[1] = r.nextInt(9) + 1;
		if(answer[0] == answer[2])
			while(answer[0] == answer[2])
				answer[2] = r.nextInt(9) + 1;
		if(answer[1] == answer[2])
			while(answer[1] == answer[2])
				answer[2] = r.nextInt(9) + 1;

		int cntStrike=0, cntBall=0, cntThrow=0;
		System.out.println("숫자 야구 게임!");
		while(true) {
			cntThrow++;
			cntStrike=0;
			cntBall=0;
			int[] input = new int[3];
			System.out.print("공을 던져주세요 : ");
			for(int i=0;i<3;i++)
				input[i] = sc.nextInt();

			//process
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(answer[i] == input[j]){
						if(i==j)
							cntStrike++;
						else
							cntBall++;
					}
				}
			}
			if(cntStrike == 3) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println(cntStrike + "strike " + cntBall + " ball입니다.");
			}
		}
		System.out.println("투구 횟수 : "+cntThrow);
	}
}
