import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��α� ��ǥ���� �Է��ϼ��� : ");
		int limit = sc.nextInt();
		int n = 1, sum = 0;
		System.out.println("��ǥ�� : "+limit+"����");
		
		while(true){
			int donate=0;
			System.out.print(n+". ��α��� �Է��ϼ��� : ");
			donate = sc.nextInt();
			if(donate>20){
				System.out.println("��δ� 1ȸ 20���� ���Ϸ� �����մϴ�.");
				continue;
			}else{
				System.out.println(donate+"������ ����ϼ̽��ϴ�.");
				sum = sum + donate - 8;
				if(sum >= limit){
					break;
				}else if(sum < 0){
					sum = 0;
				}
				System.out.println("���� ��α� �Ѿ� : " + sum + "����");
			}
			n++;
		}
		System.out.println("��ǥ���� �޼��Ǿ����ϴ�! �� "+n+"ȸ ����ϼ̽��ϴ�.");
	}
}
