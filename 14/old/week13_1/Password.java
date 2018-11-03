package week13_1;

import java.util.Scanner;

public class Password {

	Scanner sc = new Scanner(System.in);
	
	boolean isRun = true;
	String strPwd;
	String strTemp;
	
	public Password() {
		System.out.println("===비밀번호 생성===");
	}
	
	public void makePwd() {
		System.out.println("비밀번호를 입력해 주세요. (8글자 이상, 대문자/소문자/숫자 포함)");
		strTemp = sc.nextLine();
	}
	
	public void checkPwd() {
		char[] buffer = strTemp.toCharArray();
		boolean[] isOk = new boolean[3];
		
		if (buffer.length < 8) {
			System.out.println("8자리 이상이 아닙니다.");
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
				System.out.println("대문자가 포함되어 있지 않습니다.");
			if (!isOk[1])
				System.out.println("소문자가 포함되어 있지 않습니다.");
			if (!isOk[2])
				System.out.println("숫자가 포함되어 있지 않습니다.");
			if (isOk[0] && isOk[1] && isOk[2])
				strPwd = strTemp;
		}
		
	}
	
	public void confirmPwd() {
		if (strPwd != null) {
			System.out.println("확인 비밀번호를 입력해 주세요.");
			while (!strPwd.equals(sc.nextLine())) {
				System.out.println("비밀번호가 일치하지 않습니다.");
				System.out.println("확인 비밀번호를 다시 입력해 주세요.");
			}
			isRun = false;
			System.out.println("비밀번호가 생성되었습니다.");
		}
	}
	
}
