package week13_1;

public class Main {

	public static void main(String[] args) {

		Password pwd = new Password();
		
		while(pwd.isRun) {
			pwd.makePwd();
			pwd.checkPwd();
			pwd.confirmPwd();
		}
		
	}

}
