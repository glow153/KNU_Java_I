import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("기부금 목표액을 입력하세요 : ");
		int limit = sc.nextInt();
		int n = 1, sum = 0;
		System.out.println("목표액 : "+limit+"만원");
		
		while(true){
			int donate=0;
			System.out.print(n+". 기부금을 입력하세요 : ");
			donate = sc.nextInt();
			if(donate>20){
				System.out.println("기부는 1회 20만원 이하로 가능합니다.");
				continue;
			}else{
				System.out.println(donate+"만원을 기부하셨습니다.");
				sum = sum + donate - 8;
				if(sum >= limit){
					break;
				}else if(sum < 0){
					sum = 0;
				}
				System.out.println("현재 기부금 총액 : " + sum + "만원");
			}
			n++;
		}
		System.out.println("목표액이 달성되었습니다! 총 "+n+"회 기부하셨습니다.");
	}
}
