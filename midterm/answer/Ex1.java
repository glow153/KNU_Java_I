import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ���� ��ȯ�� ===");
		System.out.print("10���� �Է� : ");
		int input = sc.nextInt();
		int[] arrBase2 = new int[7];
		int[] arrBase16 = new int[2];

		// base 2
		int idx = 6;
		int num = input;
		while (num > 0) {
			if (num % 2 == 1) {
				arrBase2[idx--] = 1;
			} else {
				arrBase2[idx--] = 0;
			}
			num /= 2;
		}

		// base 16
		for (int j = 0; j < 3; j++) {
			arrBase16[0] += arrBase2[j] * Math.pow(2, 2 - j);
		}
		for (int j = 0; j < 4; j++) {
			arrBase16[1] += arrBase2[j + 3] * Math.pow(2, 3 - j);
		}

		System.out.println("�Է¹��� 10���� : " + input);
		System.out.print(input + "�� 2���� ǥ�� : ");
		for (int n : arrBase2)
			System.out.print(n);
		System.out.println();
		System.out.print(input + "�� 16���� ǥ�� : 0x");
		for(int i=0;i<2;i++) {
			char c = (char)((int)'0' + arrBase16[i]);
			if(arrBase16[i] >= 10)
				c = (char)((int)'A' + (arrBase16[i] - 10));
			System.out.print(c);
		}

		sc.close();
	}
}
