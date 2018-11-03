package week13_1;

import java.util.Scanner;

public class Password {

	Scanner sc = new Scanner(System.in);
	
	boolean isRun = true;
	String strPwd;
	String strTemp;
	
	public Password() {
		System.out.println("===��й�ȣ ����===");
	}
	
	public void makePwd() {
		System.out.println("��й�ȣ�� �Է��� �ּ���. (8���� �̻�, �빮��/�ҹ���/���� ����)");
		strTemp = sc.nextLine();
	}
	
	public void checkPwd() {
		char[] buffer = strTemp.toCharArray();
		boolean[] isOk = new boolean[3];
		
		if (buffer.length < 8) {
			System.out.println("8�ڸ� �̻��� �ƴմϴ�.");
		} else {
			for (int i = 0; i < buffer.length; i++) {
				if (!isOk[0]) {
					if (Character.isUpperCase(buffer[i])) {
						isOk[0] = true;
						continue;
					}
				}
				if (!isOk[1]) {
					if (Character.isLowerCase(buffer[i])) {
						isOk[1] = true;
						continue;
					}
				}
				if (!isOk[2]) {
					if (Character.isDigit(buffer[i])) {
						isOk[2] = true;
						continue;
					}
				}
			}
			
			if (!isOk[0]) 
				System.out.println("�빮�ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			if (!isOk[1])
				System.out.println("�ҹ��ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			if (!isOk[2])
				System.out.println("���ڰ� ���ԵǾ� ���� �ʽ��ϴ�.");
			if (isOk[0] && isOk[1] && isOk[2])
				strPwd = strTemp;
		}
		
	}
	
	public void confirmPwd() {
		if (strPwd != null) {
			System.out.println("Ȯ�� ��й�ȣ�� �Է��� �ּ���.");
			while (!strPwd.equals(sc.nextLine())) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				System.out.println("Ȯ�� ��й�ȣ�� �ٽ� �Է��� �ּ���.");
			}
			isRun = false;
			System.out.println("��й�ȣ�� �����Ǿ����ϴ�.");
		}
	}
	
}
