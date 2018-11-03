import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, pos = -1;
		int[] arr = new int[7];
		for(int i = 0; i < 7; i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i] = sc.nextInt();
		}
		System.out.print("찾고자 하는 정수 입력 : ");
		a = sc.nextInt();
		for(int i = 0; i < 7; i++) {
			if(arr[i] == a)
				pos = i + 1;
		}
		System.out.println( (pos != -1) ? (pos + "번째") : "없음" );
	}
}
