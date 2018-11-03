import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 개수 입력 : ");
		int n = sc.nextInt();
		int[] input = new int[n];
		String result = "";
		int sum = 0;

		System.out.print(n+"개의 정수 입력 : ");
		for(int i=0;i<n;i++){
			input[i] = sc.nextInt();
		}

		Arrays.sort(input);

		for(int i=n-1;i>=0;i--){
			result += Integer.toString(input[i]);
			sum += input[i];
		}

		if(sum == 0)
			result = "0";

		System.out.println(n + "개의 정수로 만들 수 있는 가장 큰 수는 "+result+"입니다.");
	}
}
