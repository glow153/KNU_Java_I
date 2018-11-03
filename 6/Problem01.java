import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Problem01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� �Է� : ");
		int n = sc.nextInt();
		int[] input = new int[n];
		String result = "";
		int sum = 0;

		System.out.print(n+"���� ���� �Է� : ");
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

		System.out.println(n + "���� ������ ���� �� �ִ� ���� ū ���� "+result+"�Դϴ�.");
	}
}
