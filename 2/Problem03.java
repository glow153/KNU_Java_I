package practice_2nd_week;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a11 = sc.nextInt();
		int a12 = sc.nextInt();
		int a21 = sc.nextInt();
		int a22 = sc.nextInt();
		int b11 = sc.nextInt();
		int b12 = sc.nextInt();
		int b21 = sc.nextInt();
		int b22 = sc.nextInt();
		
		System.out.printf("%d %d %d %d\n", a11+b11, a12+b12, a21+b21, a22+b22);
		System.out.printf("%d %d %d %d\n", a11-b11, a12-b12, a21-b21, a22-b22);
		System.out.printf("%d %d %d %d\n", a11*b11+a12*b21, a11*b12+a12*b22,
											a21*b11+a22*b21, a21*b12+a22*b22);
	}
}
