import java.util.Scanner;
import java.util.Random;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = new String[7];
		int[] credit = new int[7];
		double[] grade = new double[7];
		int sumGrade = 0, sumCredit = 0;

		System.out.println("===== ������� ���� =====");
		for(int i=0;i<7;i++){
			subject[i] = sc.next();
			credit[i] = sc.nextInt();
			grade[i] = sc.nextDouble();
		}
		System.out.println("---------------------------");
		for(int i=0;i<7;i++){
			sumGrade += credit[i] * grade[i];
			sumCredit += credit[i];
		}

		System.out.println("�̹��б� ������� : "+ ((double)sumGrade / sumCredit));
	}
}
