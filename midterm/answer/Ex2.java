import java.util.Arrays;
import java.util.Random;

public class Ex2 {
	public static void main(String[] args) {
		int[][] triangle = new int[4][];
		Random r = new Random();
		System.out.println("****�迭 ����****");
		int num = 1;
		for (int i = 0; i < triangle.length; i++) {
			triangle[i] = new int[num];
			num++;
		}
		
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] = r.nextInt(10);
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
		
		//���� ����
		
		int[] arrTmp = new int[10];
		int idx = 0;
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				arrTmp[idx++] = triangle[i][j];
			}
		}
		Arrays.sort(arrTmp);
		idx = 0;
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] = arrTmp[idx++];
			}
		}
		
		//���� ��

		System.out.println();
		System.out.println("****�迭�� ���� ��****");
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++)
				System.out.print(triangle[i][j] + " ");
			System.out.println();
		}
	}
}
