import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int a = 0, pos = -1;
		int[] arr = new int[9];

		for(int i = 0; i < 9; i++)
			arr[i] = r.nextInt(100);
		Arrays.sort(arr);

		System.out.print("�迭 ���� : ");
		for(int i = 0; i < 9; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
		System.out.println("�ִ� : " + arr[8] + ", �ּڰ� : " + arr[0] + ", �߰��� : " + arr[4]);
	}
}
